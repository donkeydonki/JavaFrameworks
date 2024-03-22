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
            return "about"; // about.html page reference
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

<b>Part G:</b>

<b>Part H:</b>

<b>Part I:</b>

<b>Part J:</b>
