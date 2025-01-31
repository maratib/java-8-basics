## 1. **What is Jenkins?**

Jenkins is an open-source automation server used to automate tasks related to building, testing, and deploying software. It supports continuous integration (CI) and continuous delivery (CD) processes.

## 2. **What are the key features of Jenkins?**

- Free and open-source
- Easy installation and configuration
- Extensible with plugins
- Supports distributed builds
- Integration with various tools like Git, Maven, and Docker

## 3. **What is Continuous Integration (CI)?**

Continuous Integration is a software development practice where developers integrate their code into a shared repository frequently, often multiple times a day. Jenkins automates this process by running builds and tests on each commit.

## 4. **What are Jenkins pipelines?**

Jenkins pipelines are a way to define and automate complex workflows, such as building, testing, and deploying software. Pipelines are written as code using Groovy in a `Jenkinsfile`.

## 5. **What is a Jenkinsfile?**

A Jenkinsfile is a text file that contains the definition of a Jenkins pipeline. It is stored in the source code repository and allows pipeline configuration to be versioned along with the code.

## 6. **What are the two types of pipelines in Jenkins?**

- **Declarative Pipeline:** A simpler, predefined structure for pipelines.
- **Scripted Pipeline:** More flexible, written in Groovy, and allows advanced scripting.

## 7. **How do you configure Jenkins jobs?**

1. Go to the Jenkins dashboard.
2. Click on "New Item."
3. Enter a name for the job and select the type (Freestyle, Pipeline, etc.).
4. Configure the job by setting parameters, source code repository, and build steps.
5. Save and execute the job.

## 8. **What is the role of plugins in Jenkins?**

Plugins extend Jenkins' functionality. For example:

- Git Plugin for source control integration
- Maven Plugin for building projects
- Docker Plugin for managing containers
- Slack Plugin for notifications

## 9. **What is the difference between Freestyle and Pipeline jobs?**

- **Freestyle Jobs:** Simple configurations for tasks like running a script or executing a build.
- **Pipeline Jobs:** Scriptable workflows that support complex CI/CD processes and can be defined as code.

## 10. **How do you secure Jenkins?**

- Enable authentication and authorization.
- Use HTTPS for secure communication.
- Restrict access to specific users or groups.
- Keep Jenkins and its plugins updated.
- Enable the CSRF Protection option.

## 11. **What is the use of Jenkins agents/slaves?**

Agents/slaves are secondary machines used to distribute workload in Jenkins. They execute jobs and reduce the load on the master.

## 12. **How does Jenkins integrate with Git?**

- Install the Git Plugin.
- Configure the repository URL in the job settings.
- Use Git-specific build triggers like "Poll SCM" or "Webhook."

## 13. **What are Jenkins triggers?**

Triggers define when a Jenkins job should run. Examples:

- Build after a commit in SCM
- Scheduled builds using CRON
- Manual trigger from the UI

## 14. **What is the Blue Ocean plugin?**

Blue Ocean is a modern user interface for Jenkins that provides a simplified and visualized approach to pipeline creation and management.

## 15. **How do you handle a failed build in Jenkins?**

- Check the build logs for errors.
- Verify SCM changes and dependencies.
- Fix the issue and rebuild.
- Configure post-build actions like sending notifications on failure.

## 16. **What is Jenkins' role in DevOps?**

Jenkins is a key tool in the CI/CD process of DevOps, helping teams automate build, test, and deploy cycles, reducing manual effort and improving collaboration.

## 17. **How do you implement distributed builds in Jenkins?**

- Configure master-slave architecture.
- Install the Jenkins agent on the slave machine.
- Connect the slave to the master via SSH or JNLP.
- Assign jobs to the slave nodes.

## 18. **What are environment variables in Jenkins?**

Environment variables are predefined variables that provide information about the environment, such as `BUILD_NUMBER`, `JOB_NAME`, and `WORKSPACE`.

## 19. **How can you integrate Jenkins with Docker?**

- Install the Docker and Docker Pipeline plugins.
- Use Docker commands in pipeline scripts to build and run containers.
- Create Docker images for deployment.

## 20. **What is the difference between Jenkins and other CI/CD tools like GitLab CI or CircleCI?**

- Jenkins is open-source and highly customizable with plugins.
- GitLab CI is tightly integrated with GitLab.
- CircleCI offers hosted CI/CD services with minimal setup.
- Jenkins is self-hosted, whereas others often provide cloud-based solutions.
