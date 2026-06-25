from selenium import webdriver
from selenium.webdriver import Keys,ActionChains
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/keyboard-events")
    actions = ActionChains(driver)

    print(driver.title)

    actions.send_keys("Selenium").send_keys(Keys.RETURN).pause(1).perform();

    print("Displayed text is: ", driver.find_element(By.CSS_SELECTOR,"h1.mt-3").text)
    
    driver.quit()