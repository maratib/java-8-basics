## 1. What is Bash?

Bash (Bourne Again SHell) is a command-line interface and scripting language. It is commonly used in Linux and macOS systems for interacting with the operating system and automating tasks.

## 2. How can you display the current working directory in Bash?

Use the `pwd` (print working directory) command to display the current directory.

```bash
pwd
```

## 3. How do you list all files, including hidden ones, in a directory?

Use the `ls -a` command to list all files, including hidden ones.

```bash
ls -a
```

## 4. What is the difference between `>` and `>>` in Bash?

- `>` is used for output redirection and overwrites the file.
- `>>` appends the output to the file without overwriting.

```bash
echo "Hello" > file.txt    # Overwrites the content of file.txt
echo "World" >> file.txt   # Appends to file.txt
```

## 5. How do you copy files in Bash?

Use the `cp` command to copy files.

```bash
cp source.txt destination.txt
```

## 6. How can you move files in Bash?

Use the `mv` command to move files.

```bash
mv source.txt /path/to/destination/
```

## 7. How can you remove a file in Bash?

Use the `rm` command to remove a file.

```bash
rm file.txt
```

## 8. How can you display the contents of a file in Bash?

Use the `cat` command to display the content of a file.

```bash
cat file.txt
```

## 9. How do you search for a text pattern in a file?

Use the `grep` command to search for patterns in files.

```bash
grep "pattern" file.txt
```

## 10. How can you count the number of lines in a file?

Use the `wc -l` command to count the number of lines in a file.

```bash
wc -l file.txt
```

## 11. How do you compare two files in Bash?

Use the `diff` command to compare two files.

```bash
diff file1.txt file2.txt
```

## 12. How do you check disk usage in Bash?

Use the `df` command to check disk space usage.

```bash
df -h
```

## 13. How can you check memory usage in Bash?

Use the `free -h` command to check memory usage.

```bash
free -h
```

## 14. How do you create a new directory in Bash?

Use the `mkdir` command to create a new directory.

```bash
mkdir new_directory
```

## 15. How do you remove an empty directory in Bash?

Use the `rmdir` command to remove an empty directory.

```bash
rmdir empty_directory
```

## 16. How do you find the location of a command in Bash?

Use the `which` command to find the location of a command.

```bash
which ls
```

## 17. What is the purpose of the `chmod` command?

The `chmod` command is used to change the file permissions (read, write, execute) of a file.

```bash
chmod +x script.sh   # Gives execute permission to the file
```

## 18. How can you find files in a directory based on a pattern?

Use the `find` command to search for files based on a pattern.

```bash
find /path/to/dir -name "*.txt"
```

## 19. What does the `ps` command do?

The `ps` command displays a snapshot of the current running processes.

```bash
ps aux
```

## 20. How can you terminate a running process in Bash?

Use the `kill` command to terminate a process by its PID (process ID).

```bash
kill 1234   # Where 1234 is the PID
```

## 21. What is the purpose of the `top` command?

The `top` command shows real-time system information, including running processes, CPU usage, memory usage, and more.

```bash
top
```

## 22. How do you display a file's contents page by page?

Use the `less` or `more` command to display the file content page by page.

```bash
less file.txt
```

## 23. What does the `echo` command do?

The `echo` command is used to display text or variables to the terminal.

```bash
echo "Hello, world!"
```

## 24. How do you create a symbolic link in Bash?

Use the `ln -s` command to create a symbolic link.

```bash
ln -s /path/to/original /path/to/symlink
```

## 25. How do you display the environment variables in Bash?

Use the `env` or `printenv` command to display the environment variables.

```bash
env
```

## 26. How do you read input from the user in Bash?

Use the `read` command to read input from the user.

```bash
read -p "Enter your name: " name
echo "Hello, $name!"
```

## 27. What is the purpose of the `history` command?

The `history` command displays a list of previously executed commands.

```bash
history
```

## 28. How can you set a variable in Bash?

Use the `=` operator to set a variable.

```bash
name="John"
echo $name
```

## 29. What is the difference between a shell variable and an environment variable?

- **Shell variable:** Exists only in the shell session.
- **Environment variable:** Available to all processes started from the shell.

## 30. How do you exit a Bash script?

Use the `exit` command to exit a script and return a status code.

```bash
exit 0
```
