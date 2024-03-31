<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION
CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY
STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY

### Student Info

<b>Name:</b> Sumika Helffrich
</br>
<b>Course:</b> D287 - Java Frameworks
<br><b>ID:</b> 011894470
<hr>

## Part B:

Create a README file that includes notes describing where in the code to find the changes you made for each of parts C
to J. Each note should include the prompt, file name, line number, and change.

<b>Part C:</b>
<pre>
mainscreen.html
Changed line 14: 
Before - < title > My Bicycle Shop < /title >
After  - < title > The Potion Parlour < /title >

Added to line 16:
Before  - 
After   - < body style="background-color: #E6E6FA;" >

Changed line 19-22
Before  - < h1 >Shop< /h1 >
After   - < h1 class="text-center"> The Potion Parlour < /h1>
          < style> h1, h2 { font-family: 'Shadows Into Light', cursive; } < /style>

Changed line 33
Before  - < a th:href="@{/showFormAddInPart}" class="btn btn-primary btn-sm mb-3">Add Inhouse Part < /a>
After   - < a th:href="@{/showFormAddInPart}" class="btn btn-secondary btn-sm mb-3">Add Inhouse Part< /a>

Changed line 34
Before  - < a th:href="@{/showFormAddOutPart}" class="btn btn-primary btn-sm mb-3">Add Outsourced Part< /a>
After   - < a th:href="@{/showFormAddOutPart}" class="btn btn-secondary btn-sm mb-3">Add Outsourced Part< /a>

Changed line 70
Before  - < a th:href="@{/showFormAddProduct}" class="btn btn-primary btn-sm mb-3">Add Product< /a>
After   - < a th:href="@{/showFormAddProduct}" class="btn btn-secondary btn-sm mb-3">Add Product< /a>
</pre>


<b>Part D:</b>
<pre>
Created - about.html

    < !DOCTYPE html>
    < html lang="en">
    < head>
        < meta charset="UTF-8">
        < title>About Us< /title>
    < /head>
    < body style="background-color: #E6E6FA;">
    < style>
        h1 {font-family: 'Shadows Into Light', cursive;}
    < /style>
        < h1 class="text-center" style="text-align: center;"> About Us < /h1>
    
        < p class="text-center" style="text-align: center; font-size: 20px;">
            Welcome to the Potion Parlour, where magic bubbles in every vial and wonder awaits around every corner. <br>
            We source the rarest ingredients and craft unique elixirs to fulfill your wishes, (or at least) make your day a little brighter!
        < /p>
    
    < a href="http://localhost:8080/"> Back to Main Screen< /a>
    < /body>
    < /html>


Added to line 23-25, mainscreen.html
Before  - 
After   -   < div style="text-align: center;">
            < a th:href="@{about}">About Us< /a>
            < /div>

Added to line 55-58, MainScreenControllerr.java
Before  -
After   -   @GetMapping("/about")
            public String about() {
            return "about"; 
            }
</pre>

<b>Part E:</b>
<pre>
Added to line 77-122, BootStrapData.java

 if (partRepository.count() == 0) {
    InhousePart vial = new InhousePart();
    vial.setName("Vial");
    vial.setPrice(6.99);
    vial.setInv(20);

    InhousePart herb = new InhousePart();
    herb.setName("Herb mix");
    herb.setPrice(4.99);
    herb.setInv(30);

    InhousePart baseLiquid = new InhousePart();
    baseLiquid.setName("Base liquid");
    baseLiquid.setPrice(3.99);
    baseLiquid.setInv(30);

    InhousePart keyIngredient = new InhousePart();
    keyIngredient.setName("Key Ingredient");
    keyIngredient.setPrice(9.99);
    keyIngredient.setInv(40);

    OutsourcedPart cork = new OutsourcedPart();
    cork.setName("Cork stopper");
    cork.setPrice(1.99);
    cork.setInv(40);

    partRepository.save(vial);
    partRepository.save(herb);
    partRepository.save(baseLiquid);
    partRepository.save(keyIngredient);
    partRepository.save(cork);
    }

if (productRepository.count() == 0) {
    Product calmingPotion = new Product("Calming potion",29.99,20);
    Product healingPotion = new Product("Healing potion",29.99,23);
    Product energyPotion = new Product("Energy Potion",29.99,34);
    Product protectionPotion = new Product("Protection potion",29.99,41);
    Product clarityPotion = new Product("Clarity potion",29.99,35);

    productRepository.save(calmingPotion);
    productRepository.save(healingPotion);
    productRepository.save(energyPotion);
    productRepository.save(protectionPotion);
    productRepository.save(clarityPotion);
    }
</pre>

<b>Part F:</b>
<pre>
Created - successPurchase.html
    < !DOCTYPE html>
    < html lang="en">
    < head>
        < meta charset="UTF-8">
        < title>Purchase Success< /title>
    < /head>
    < body style="background-color: #E6E6FA;">
    < style>
        h1 {font-family: 'Shadows Into Light', cursive;}
    < /style>
    < h1 class="text-center" style="text-align: center;"> Purchase Success! < /h1>
    
    < p class="text-center" style="text-align: center; font-size: 20px;">
        Your purchase was successful! Thank you for shopping at the Potion Parlour!
        Click the link below to return to the main page.
    < /p>
    
    < a href="http://localhost:8080/"> Back to Main Screen< /a>
    < /body>
    < /html>


Created - failPurchase.html
    < !DOCTYPE html>
    < html lang="en">
    < head>
        < meta charset="UTF-8">
        < title>Purchase Failed< /title>
    < /head>
    < body style="background-color: #E6E6FA;">
    < style>
        h1 {font-family: 'Shadows Into Light', cursive;}
    < /style>
    < h1 class="text-center" style="text-align: center;"> Something went wrong... < /h1>
    
    < p class="text-center" style="text-align: center; font-size: 20px;">
        Something went wrong with your purchase. Please go back to the main page and try again.
    < /p>
    
    < a href="http://localhost:8080/"> Back to Main Screen< /a>
    < /body>
    < /html>


Added to line 107-114, Product.java
Before  - 
After   -  public boolean buyNow() {
            if (this.inv >= 1) {
                this.inv--;
                return true;
            } else {
                return false;
                }
            }

Added to line 176-188, AddProductController.java
Before  -
After   - @GetMapping("/buyNow")
            public String buyNow(@RequestParam("productID") int theId, Model theModel) {
                ProductService productService = context.getBean(ProductServiceImpl.class);
                Product buyProduct = productService.findById(theId);
        
                boolean purchaseConfirmation = buyProduct.buyNow();
                if (purchaseConfirmation) {
                    productService.save(buyProduct);
                    return "successPurchase";
                } else {
                    return "failPurchase";
                }
            }
</pre>

<b>Part G:
Modify the parts to track maximum and minimum inventory by doing the following: </b>


<b>Add additional fields to the part entity for maximum and minimum inventory.</b>
- Created columns to the part table for minimum and maximum inventory 
- Set thymeleaf attribute to populate the data 
<pre>
Modified mainscreen.html

line 44-45
Before  -
After   -   < th>Minimum< /th>
            < th>Maximum< /th>

line 54-54
Before  -
After   -   < td th:text="${tempPart.minimum}">1< /td>
            < td th:text="${tempPart.maximum}">1< /td>
</pre>

<b>Modify the sample inventory to include the maximum and minimum fields.</b>
- Defined minimum and maximum inventory fields with validation for minimum value with a message
<pre>
Modified Part.java
line 31-33
Before  - 
After   - @Min(value = 0, message = "Minimum inventory must be more than zero")
            int minimum;
            int maximum;
</pre>

- Created getters and setters for minimum and maximum inventory
<pre>
Modified Part.java
line 108-114
Before  -
After   -   public void setMinimum(int minimum) { this.minimum = minimum; }

            public int getMinimum() { return this.minimum; }

            public void setMaximum(int maximum) { this.maximum = maximum; }

            public int getMaximum() { return this.maximum; }
</pre>

- Set default values for minimum and maximum inventory in constructors
<pre>
Modified Part.java
line 47-48
Before  - 
After   -   this.minimum = 0;
            this.maximum = 100;
line 56-57
Before  - 
After   -   this.minimum = 0;
            this.maximum = 100;

Modified InhousePart.java
line 18-19
Before  -   public InhousePart() {
        }
After   -   public InhousePart() {
            this.minimum = 0;
            this.maximum = 100;
        }

Modified OutsourcedPart.java
line 18-19
Before  -   public OutsourcedPart() {
        }
After   -   public OutsourcedPart() {
            this.minimum = 0;
            this.maximum = 100;
        }
</pre>

<b>Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.</b>
- Added styling, font, input fields for minimum/maximum inventory, and error handling
<pre>
Modified InhousePartForm.html
line 9-13
Before  -   < body>
            < h1>Inhouse Part Detail< /h1>
After   -   < body style="background-color: #E6E6FA;">
            < h1 class="text-center">Inhouse Part Detail< /h1>
            < style>
                h1 {font-family: 'Shadows Into Light', cursive;}
            < /style>

line 27-30
Before  -
After   -   < p>< input type="text" th:field="*{minimum}" placeholder="Minimum" class="form-control mb-4 col-4">< /p>

            < p>< input type="text" th:field="*{maximum}" placeholder="Minimum" class="form-control mb-4 col-4">< /p>

line 33-38
Before  -
After   -   < p>
            < div th:if="${#fields.hasAnyErrors()}">
                < ul>< li th:each="err: ${#fields.allErrors()}" th:text="${err}">< /li>< /ul>
            < /div>
            < /p>

Modified OutsourcedPartForm.html
line 9-13
Before  -   < body>
            < h1>Outsourced Part Detail< /h1>
After   -   < body style="background-color: #E6E6FA;">
            < h1 class="text-center">Outsourced Part Detail< /h1>
            < style>
                h1 {font-family: 'Shadows Into Light', cursive;}
            < /style>

line 27-32
Before  -
After   -   < p>< input type="text" th:field="*{minimum}" placeholder="Minimum" class="form-control mb-4 col-4">< /p>
                < p th:if="${#fields.hasErrors('inv')}" th:errors="*{inv}">Inventory Error< /p>
    
            < p>< input type="text" th:field="*{maximum}" placeholder="Minimum" class="form-control mb-4 col-4">< /p>
                < p th:if="${#fields.hasErrors('inv')}" th:errors="*{inv}">Inventory Error< /p>

line 35-40
Before  -
After   -   < p>
            < div th:if="${#fields.hasAnyErrors()}">
                < ul>< li th:each="err: ${#fields.allErrors()}" th:text="${err}">< /li>< /ul>
            < /div>
            < /p>
</pre>

<b>Rename the file the persistent storage is saved to.</b>
- Renamed the database file  
<pre>
application.properties
line 6
Before  -   spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db102  
After   -   spring.datasource.url=jdbc:h2:file:~/src/main/resources/spring-boot-h2-db102-sumika
</pre>

<b>Modify the code to enforce that the inventory is between or at the minimum and maximum value.</b>
- Created validationLimit() method  
    - Enforces valid inventory levels by adjusting inventory to the minimum or maximum value if it falls outside the allowed range.
<pre>
Modified Part.java
line 100-106
Before  -   
After   -   public void validationLimit() {
                if (this.inv < this.minimum) {
                    this.inv = this.minimum;
                } else if (this.inv > this.maximum) {
                    this.inv = this.maximum;
                }
            }
</pre>

- Implemented inventory validation using validationLimit() in both InhousePartServiceImpl and OutsourcedPartServiceImpl to guarantee valid data
<pre>
Modified InhousePartServiceImpl.java
line 54
Before  -   public void save(InhousePart thePart) {
            partRepository.save(thePart); 
After   -   public void save(InhousePart thePart) {
            thePart.validationLimit();
            partRepository.save(thePart);

Modified OutsourcedPartServiceImpl.java
line 52 
Before  -   public void save(OutsourcedPart thePart) {
            partRepository.save(thePart); 
After   -   public void save(OutsourcedPart thePart) {
            thePart.validationLimit();
            partRepository.save(thePart);
</pre>

<b>Part H:</b>
Before  -   
After   -   
<b>Part I:</b>

<b>Part J:</b>
