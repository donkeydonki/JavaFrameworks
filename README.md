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

## <b>Part C:
Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts. </b>
<pre>
Modified mainscreen.html
line 14: 
Before - < title > My Bicycle Shop < /title >
After  - < title > The Potion Parlour < /title >

line 16:
          < body style="background-color: #E6E6FA;" >

line 19-22:
Before  - < h1 >Shop< /h1 >
After   - < h1 class="text-center"> The Potion Parlour < /h1>
          < style> h1, h2 { font-family: 'Shadows Into Light', cursive; } < /style>

line 33:
Before  - < a th:href="@{/showFormAddInPart}" class="btn btn-primary btn-sm mb-3">Add Inhouse Part < /a>
After   - < a th:href="@{/showFormAddInPart}" class="btn btn-secondary btn-sm mb-3">Add Inhouse Part< /a>

line 34: 
Before  - < a th:href="@{/showFormAddOutPart}" class="btn btn-primary btn-sm mb-3">Add Outsourced Part< /a>
After   - < a th:href="@{/showFormAddOutPart}" class="btn btn-secondary btn-sm mb-3">Add Outsourced Part< /a>

line 70:
Before  - < a th:href="@{/showFormAddProduct}" class="btn btn-primary btn-sm mb-3">Add Product< /a>
After   - < a th:href="@{/showFormAddProduct}" class="btn btn-secondary btn-sm mb-3">Add Product< /a>
</pre>


## <b>Part D:
Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen. </b>
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

Modified mainscreen.html
line 23-25: 
            < div style="text-align: center;">
            < a th:href="@{about}">About Us< /a>
            < /div>

Modified MainScreenControllerr.java
line 55-58: 
            @GetMapping("/about")
            public String about() {
            return "about"; 
            }
</pre>

## <b>Part E:
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.</b>
<pre>
Modified BootStrapData.java
line 77-122:

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
    Product healingPotion = new Product("Healing potion",29.99,20);
    Product energyPotion = new Product("Energy Potion",29.99,30);
    Product protectionPotion = new Product("Protection potion",29.99,40);
    Product clarityPotion = new Product("Clarity potion",29.99,30);

    productRepository.save(calmingPotion);
    productRepository.save(healingPotion);
    productRepository.save(energyPotion);
    productRepository.save(protectionPotion);
    productRepository.save(clarityPotion);
    }

</pre>

## <b>Part F:
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
- The “Buy Now” button must be next to the buttons that update and delete products.
- The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
- Display a message that indicates the success or failure of a purchase.</b>
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
</pre>

<pre>
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
</pre>

<pre>
Modified Product.java
line 107-114: 
            public boolean buyNow() {
            if (this.inv >= 1) {
                this.inv--;
                return true;
            } else {
                return false;
                }
            }
</pre>

<pre>
Modified AddProductController.java
line 176-188: 
            @GetMapping("/buyNow")
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

## <b>Part G:
Modify the parts to track maximum and minimum inventory by doing the following:

- Add additional fields to the part entity for maximum and minimum inventory.</b>

<pre>
Modified mainscreen.html
line 44-45
            < th>Minimum< /th>
            < th>Maximum< /th>

line 54-54
            < td th:text="${tempPart.minimum}">1< /td>
            < td th:text="${tempPart.maximum}">1< /td>
</pre>

- <b> Modify the sample inventory to include the maximum and minimum fields.</b>
<pre>
Modified Part.java
line 31-33:
        @Min(value = 0, message = "Minimum inventory must be more than zero")
            int minimum;
            int maximum;


Modified Part.java
line 108-114:
            public void setMinimum(int minimum) { this.minimum = minimum; }

            public int getMinimum() { return this.minimum; }

            public void setMaximum(int maximum) { this.maximum = maximum; }

            public int getMaximum() { return this.maximum; }


Modified InhousePart.java
line 18-19:
        public InhousePart() {
            this.minimum = 0;
            this.maximum = 100;
        }


Modified OutsourcedPart.java
line 18-19:
        public OutsourcedPart() {
            this.minimum = 0;
            this.maximum = 100;
        }
</pre>

- <b>Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.</b>

<pre>
Modified InhousePartForm.html
line 9-13:
Before  -   < body>
            < h1>Inhouse Part Detail< /h1>
After   -   < body style="background-color: #E6E6FA;">
            < h1 class="text-center">Inhouse Part Detail< /h1>
            < style>
                h1 {font-family: 'Shadows Into Light', cursive;}
            < /style>

line 27-30:
            < p>< input type="text" th:field="*{minimum}" placeholder="Minimum" class="form-control mb-4 col-4">< /p>

            < p>< input type="text" th:field="*{maximum}" placeholder="Maximum" class="form-control mb-4 col-4">< /p>

line 33-38:
            < p>
            < div th:if="${#fields.hasAnyErrors()}">
                < ul>< li th:each="err: ${#fields.allErrors()}" th:text="${err}">< /li>< /ul>
            < /div>
            < /p>


Modified OutsourcedPartForm.html
line 9-13:
Before  -   < body>
            < h1>Outsourced Part Detail< /h1>
After   -   < body style="background-color: #E6E6FA;">
            < h1 class="text-center">Outsourced Part Detail< /h1>
            < style>
                h1 {font-family: 'Shadows Into Light', cursive;}
            < /style>

line 27-32:
            < p>< input type="text" th:field="*{minimum}" placeholder="Minimum" class="form-control mb-4 col-4">< /p>
                < p th:if="${#fields.hasErrors('inv')}" th:errors="*{inv}">Inventory Error< /p>
    
            < p>< input type="text" th:field="*{maximum}" placeholder="Maximum" class="form-control mb-4 col-4">< /p>
                < p th:if="${#fields.hasErrors('inv')}" th:errors="*{inv}">Inventory Error< /p>

line 35-40:
            < p>
            < div th:if="${#fields.hasAnyErrors()}">
                < ul>< li th:each="err: ${#fields.allErrors()}" th:text="${err}">< /li>< /ul>
            < /div>
            < /p>
</pre>

- <b>Rename the file the persistent storage is saved to.</b>
<pre>
Modified application.properties
line 6:
Before  -   spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db102  
After   -   spring.datasource.url=jdbc:h2:file:~/src/main/resources/spring-boot-h2-db102-sumika
</pre>

- <b>Modify the code to enforce that the inventory is between or at the minimum and maximum value.</b>
<pre>
Modified Part.java
line 100-106:
            public void validationLimit() {
                if (this.inv < this.minimum) {
                    this.inv = this.minimum;
                } else if (this.inv > this.maximum) {
                    this.inv = this.maximum;
                }
            }


Modified InhousePartServiceImpl.java
line 54 :
            public void save(InhousePart thePart) {
            thePart.validationLimit();
            partRepository.save(thePart);


Modified OutsourcedPartServiceImpl.java
line 52:  
            public void save(OutsourcedPart thePart) {
            thePart.validationLimit();
            partRepository.save(thePart);
</pre>

## <b>Part H: 
Add validation for between or at the maximum and minimum fields. The validation must include the following:</b>

- <b>Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.</b>

<pre>
Modified Part.java
line 4-5:
import com.example.demo.validators.ValidPartInventory;
import com.example.demo.validators.ValidPartInventoryMinimum;

line 24-25:
@ValidPartInventory 
@ValidPartInventoryMinimum


Created PartMinimumValidator.java 

package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartMinimumValidator implements ConstraintValidator< ValidPartInventoryMinimum, Part> {
    @Autowired
    private ApplicationContext context;

    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidPartInventoryMinimum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMinimum();
    }
}

Created ValidPartInventoryMinimum

package com.example.demo.validators;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {PartMinimumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPartInventoryMinimum {
    String message() default "Inventory cannot be lower than required minimum";
    Class [] groups() default {};
    Class [] payload() default  {};
}
</pre>
<b>- Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.</b>
<pre>
No additional validation created here. The requirements in the previous step (step F), ensures inventory cannot fall below the minimum during adding or updating parts.
</pre>
<b>- Display error messages when adding and updating parts if the inventory is greater than the maximum.</b>

<pre>
Created PartInventoryValidator.java
 
package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartInventoryValidator implements ConstraintValidator< ValidPartInventory, Part> {
    @Autowired
    private ApplicationContext context;

    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidPartInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() <= part.getMaximum();
    }
}


Created ValidPartInventory.java
 
package com.example.demo.validators;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {PartInventoryValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPartInventory {
    String message() default "Inventory cannot exceed maximum value";
    Class [] groups() default {};
    Class [] payload() default {};
}
</pre>

## <b>Part I:
Add at least _two_ unit tests for the maximum and minimum fields to the PartTest class in the test package.</b>
<pre>
Modified PartTest.java
line 160-176:
@Test
    void getMinimum() {
        int minimum = 5;
        partIn.setMinimum(minimum);
        assertEquals(minimum, partIn.getMinimum());
        partOut.setMinimum(minimum);
        assertEquals(minimum, partOut.getMinimum());
    }

    @Test
    void getMaximum() {
        int maximum = 5;
        partIn.setMaximum(maximum);
        assertEquals(maximum, partIn.getMaximum());
        partOut.setMaximum(maximum);
        assertEquals(maximum, partOut.getMaximum());
    }
</pre>

## <b>Part J:
Remove the class files for any unused validators in order to clean your code. </b>
<pre>
ValidDeletePart (DeletePartValidator)               - Used in Part.java
    - Prevents part from being deleted if they're associated with a product 

DeletePartValidator                                 - Not used
    - Not used and redundant, deleted

ValidEnufParts.java (EnufPartsValidator)            - Used in Product.java 
    - Prevents adding additional parts to products if there aren't enough of them in inventory

ValidPartInventory.java (PartInventoryValidator)    - Used in Part.java
    - Prevents from part inventory to exceed maximum limit 

ValidPartInventoryMinimum (PartMinimumValidator)    - Used in Part.java
    - Prevents from part inventory to be lower than required minimum

ValidProductPrice (PriceProductValidator)           - Used in Product.java
    - Prevents the price of the product becoming less than the sum of the price of the parts

All validators are being used, none were deleted. 
</pre>
