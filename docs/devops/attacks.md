Here's a comprehensive list of common security attacks like CORS misconfigurations, XSS, SQL injection, and more, along with detailed explanations and strategies to prevent them.

---

### 1. **CORS Misconfigurations**

**Explanation**  
CORS (`Cross-Origin Resource Sharing`) misconfigurations occur when a server allows unauthorized or overly permissive origins to access its resources. Attackers can exploit these vulnerabilities to steal sensitive data or perform malicious actions.

**How to Prevent**

- **Restrict Allowed Origins**: Specify exact domains in the `Access-Control-Allow-Origin` header rather than using `*`.
- **Secure Cookies**: Use `SameSite` cookies (`Strict` or `Lax`) and enable `Secure` and `HttpOnly` flags.
- **Validate Requests**: Implement server-side checks to ensure only intended domains make requests.
- **Avoid `Access-Control-Allow-Credentials` Unless Necessary**: Allowing credentials increases risk; restrict it to trusted origins only.

**Code Example (Node.js)**:

```javascript
const cors = require("cors");

const allowedOrigins = ["https://trusted-domain.com"];

const corsOptions = {
  origin: function (origin, callback) {
    if (allowedOrigins.indexOf(origin) !== -1 || !origin) {
      callback(null, true);
    } else {
      callback(new Error("Not allowed by CORS"));
    }
  },
  credentials: true,
};

app.use(cors(corsOptions));
```

---

### 2. **XSS (Cross-Site Scripting)**

**Explanation**  
XSS occurs when malicious scripts are injected into web applications and executed in a user's browser, leading to session hijacking, credential theft, or defacement.

**Types of XSS**:

- **Stored XSS**: Malicious payload is stored on the server.
- **Reflected XSS**: Payload is included in a request and reflected back in the response.
- **DOM-Based XSS**: Manipulation occurs directly in the browser.

**How to Prevent**

- **Input Sanitization**: Filter and validate user inputs to allow only expected data.
- **Output Encoding**: Escape special characters before rendering them in the browser (e.g., `<` becomes `&lt;`).
- **Use CSP**: Implement Content Security Policy to restrict resource loading.
- **Use Security Libraries**: Libraries like DOMPurify for sanitizing HTML.

**Code Example (Sanitization with Express)**:

```javascript
const express = require("express");
const app = express();
const xss = require("xss-clean");

app.use(xss());

app.post("/submit", (req, res) => {
  const sanitizedInput = req.body.input; // Automatically sanitized by xss-clean
  res.send(`Processed: ${sanitizedInput}`);
});
```

---

### 3. **SQL Injection**

**Explanation**  
SQL injection occurs when attackers insert malicious SQL queries into input fields, potentially accessing or manipulating the database.

**How to Prevent**

- **Use Prepared Statements**: Use parameterized queries to separate SQL logic from user input.
- **Validate and Sanitize Input**: Ensure inputs conform to expected formats (e.g., no SQL keywords).
- **Use ORM Frameworks**: Frameworks like Sequelize or Django ORM abstract SQL queries, reducing risks.
- **Minimize Database Permissions**: Limit user permissions in the database.

**Code Example (Node.js with Prepared Statements)**:

```javascript
const mysql = require("mysql2/promise");

const connection = await mysql.createConnection({
  /* connection details */
});

const query = "SELECT * FROM users WHERE email = ? AND password = ?";
const [rows] = await connection.execute(query, [email, password]);
```

---

### 4. **CSRF (Cross-Site Request Forgery)**

**Explanation**  
CSRF tricks authenticated users into unknowingly performing actions (like fund transfers) on a web application.

**How to Prevent**

- **CSRF Tokens**: Generate unique tokens for each session and verify them on the server.
- **Use `SameSite` Cookies**: Prevent cookies from being sent with cross-origin requests.
- **Validate Origin and Referer Headers**: Reject requests from unknown origins.

**Code Example (CSRF Protection with Express)**:

```javascript
const csrf = require("csurf");
const csrfProtection = csrf({ cookie: true });

app.use(csrfProtection);

app.get("/form", (req, res) => {
  res.render("form", { csrfToken: req.csrfToken() });
});

app.post("/submit", csrfProtection, (req, res) => {
  res.send("Form submitted successfully");
});
```

---

### 5. **Path Traversal**

**Explanation**  
Path traversal attacks allow attackers to access files outside the intended directory by manipulating file paths.

**How to Prevent**

- **Sanitize Inputs**: Remove characters like `../` or `..\`.
- **Use Allowlists**: Only allow specific filenames or paths.
- **Use Libraries**: Use libraries to handle paths securely (e.g., `path` module in Node.js).

**Code Example (Sanitization)**:

```javascript
const path = require("path");

app.get("/file", (req, res) => {
  const filePath = path.join(
    __dirname,
    "uploads",
    path.basename(req.query.file)
  );
  res.sendFile(filePath);
});
```

---

### 6. **Clickjacking**

**Explanation**  
Clickjacking tricks users into clicking elements hidden in an iframe, performing unintended actions.

**How to Prevent**

- **X-Frame-Options Header**: Set it to `DENY` or `SAMEORIGIN`.
- **Use CSP**: Use `frame-ancestors` directive to control iframe embedding.
- **JS Frame-Busting**: Detect and break out of iframes.

**Code Example (Express with Helmet)**:

```javascript
const helmet = require("helmet");

app.use(helmet.frameguard({ action: "deny" }));
```

---

### 7. **Directory Listing**

**Explanation**  
Directory listing exposes all files in a directory to users, potentially leaking sensitive information.

**How to Prevent**

- **Disable Directory Listing**: Configure the server to block directory access.
- **Use Index Files**: Provide an `index.html` or equivalent file for each directory.

**Code Example (Express)**:

```javascript
app.use(express.static("public", { index: false }));
```

---

### 8. **Insecure Deserialization**

**Explanation**  
Insecure deserialization allows attackers to inject malicious serialized objects, leading to code execution or data tampering.

**How to Prevent**

- **Validate Serialized Data**: Check input before deserialization.
- **Use Digital Signatures**: Ensure serialized data integrity.
- **Use Updated Libraries**: Avoid libraries with known vulnerabilities.

---

### 9. **Command Injection**

**Explanation**  
Command injection occurs when attackers execute arbitrary system commands via vulnerable applications.

**How to Prevent**

- **Avoid Direct Shell Access**: Use APIs to handle tasks instead of system commands.
- **Sanitize Input**: Remove or escape dangerous characters.
- **Use Secure Libraries**: For example, `child_process.execFile` in Node.js over `exec`.

**Code Example (Node.js)**:

```javascript
const { execFile } = require("child_process");

execFile("ls", ["-l"], (error, stdout) => {
  if (error) throw error;
  console.log(stdout);
});
```

---

By following these best practices and using secure coding techniques, you can greatly reduce the risks of these vulnerabilities in your applications. Let me know if you need deeper details on any specific attack!
