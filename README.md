# ServletLifeCycle

Execution Flow
->Right click on your project 'root(project folder)' > Run as > click on "Run on Server"
->Then eclipse will open an internal web browser with the URL "http://localhost:8888/Servlet-Life-Cycle/"
->Now just append our project folder name to that URL, so the URL will be like "http://localhost:8888/Servlet-Life-Cycle/hello"
->Press enter, now you will be able to see the output

Flow:
->whenever you hit the URL (http://localhost:8888/Servlet-Life-Cycle/hello), servlet container will first loads web.xml and check the value in <url-pattern> tag in <servlet-mapping>- [We given the pattern name is /hello]
->Immediately it will check the value in <servlet-name> tag in <servlet-mapping> [we given 'myapp']

->Now it will serach for the same value in in <servlet-name> under <servlet> tag

-> So, The value of <servlet-name> under <servlet-mapping> and the value of  <servlet-name> under <servlet> are same

->If so container will load java class given in <servlet-class> tag under the <servlet> tag

->Finally servlet container came to ServletLifeCycle class ,it will execute init() method first(only once) ->then service() or doGet() or doPost() method

->Finally destroy() method will be executed before our object get garbage collected
