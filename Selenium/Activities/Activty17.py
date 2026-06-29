from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")

    print(driver.title)

    dropdown = driver.find_element(By.CSS_SELECTOR,"select.h-80")

    select = Select(dropdown)

    select.select_by_visible_text("HTML")

    select.select_by_index(4)
    select.select_by_index(5)
    select.select_by_index(6)

    select.select_by_value("nodejs")
    
    options = select.all_selected_options

    print("Selected Options: ")
    for option in options : 
        print(option.text)

    select.deselect_by_index(5)


    print("Selected Options after deselecting: ")

    for option in options : 
        print(option.text)

    driver.quit()