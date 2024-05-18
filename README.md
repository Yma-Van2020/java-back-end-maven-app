
SCENARIO
A travel agency has recently launched a complete overhaul of their front-end vacation bookings application using Angular and JavaScript. Lately, the front-end engineers have encountered various undocumented bugs when sending requests and fetching data from the back-end. Since the back-end was built in the early 1990s and the original developer has since retired and can no longer help troubleshoot, the existing team is concerned about the growing tech debt and lack of ongoing support. Your chief technology officer (CTO) decided to create a project to port over any mission-critical functionalities to a modern framework and has selected you, a software developer in Java, to start developing the minimally viable product (MVP) to migrate the legacy back-end to the modern Spring framework.


Note: External plugins and libraries other than those specified in this task are not allowed.


A.   Create a new Java project using Spring Initializr, with each of the following dependencies:

•    Spring Data JPA (spring-boot starter-data-jpa)

•    Rest Repositories (spring-boot-starter-data-rest)

•    MySQL Driver (mysql-connector-java)

•    Lombok



B.   Create your subgroup and project by logging into GitLab using the web link provided and do the following:

•    connect your new Java project

•    commit with a message and push when you complete each of the tasks listed below (parts B to F, etc.)



Note: Any submissions that do not have a commit after each task will not be evaluated.


Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.


•    Submit a copy of the git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.


Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.



C.   Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.


Note: The packages should be on the same level of the hierarchy.


Note: Construct a package named config and copy the RestDataConfig.java provided in the laboratory environment to the package. Modify it so that the package and imports have the correct package and import addresses. Copy the application.properties file that is provided in the laboratory environment into your application properties resource file.



D.   Write code for the entities package that includes entity classes and the enum designed to match the UML diagram.


E.   Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.


F.   Write code for the services package that includes each of the following:

•    a purchase data class with a customer cart and a set of cart items

•    a purchase response data class that contains an order tracking number

•    a checkout service interface

•    a checkout service implementation class



G.   Write code to include validation to enforce the inputs needed by the Angular front-end.


H.   Write code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.


Note: You do not need to duplicate REST functionality for each repository by creating methods in Java.


I.   Add five sample customers to the application programmatically.


Note: Make sure the customer information is not overwritten each time you run the application.


J.   Run your integrated application by adding a customer order for a vacation with two excursions using the unmodified Angular front-end. Provide screenshots for the following:

•    that your application does not generate a network error when adding the data

•    your database tables using MySQL Workbench to show the data was successfully added



Note: The screenshot should include the front-end view and the inspection console in the browser.


K.   Demonstrate professional communication in the content and presentation of your submission.

Demo pictures from Angular Frontend that is not included in this BE project:
![Screenshot 2024-05-15 at 3 43 05 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/f7406478-f37f-49e2-8335-3d68f57e1b84)
![Screenshot 2024-05-15 at 3 43 13 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/4bcb4cf2-9455-4614-aec8-5fbaebb832e8)
![Screenshot 2024-05-15 at 3 43 22 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/24249960-b92a-477a-9d32-13189dd71a1b)
![Screenshot 2024-05-15 at 3 43 28 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/f808fe7d-bed0-43ab-b438-5f8902bdad44)
![Screenshot 2024-05-15 at 3 43 39 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/4ba34ab7-a7a7-4d06-91ad-a17dc71f3e57)
![Screenshot 2024-05-15 at 3 43 47 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/ffe4a12a-2368-45bd-8e84-8f0789ac0bee)
![Screenshot 2024-05-15 at 3 42 56 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/ee362551-eabd-4bf3-8db7-c0045121efe2)
![Screenshot 2024-05-15 at 3 44 54 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/8f9a168e-d300-48ee-b870-ec147edba82f)
