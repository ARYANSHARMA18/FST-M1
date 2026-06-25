from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/target-practice")

    print(driver.title)

    heading3 = driver.find_element(By.XPATH,"//h3[contains(text(),'#3')]").text
    print("Text of the Heading3 is: " , heading3)

    heading5 = driver.find_element(By.XPATH,"//h5[contains(text(),'#5')]").value_of_css_property("color")
    print("Color of Heading 5 is:" , heading5)

    purpleButtonClasses = driver.find_element(By.CLASS_NAME,"bg-purple-200").get_attribute("class")
    print("Class of purple button are : " , purpleButtonClasses)
		
    slateButtonText = driver.find_element(By.CLASS_NAME,"bg-slate-200").text
    print("Text inside Slate button is : " , slateButtonText)

    driver.quit()