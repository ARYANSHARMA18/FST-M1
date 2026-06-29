from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")

    print(driver.title)

    dropdown = driver.find_element(By.CSS_SELECTOR,"select.h-10")

    select = Select(dropdown)

    select.select_by_visible_text("Two")

    print("Second option: " , select.first_selected_option.text)

    select.select_by_index(3)

    print("Third option: " , select.first_selected_option.text)

    select.select_by_value("four")

    print("Fourth option: " , select.first_selected_option.text)

    options = select.options

    print("Options in the dropdown: ")

    for option in options : 
        print(option.text)

    driver.quit()