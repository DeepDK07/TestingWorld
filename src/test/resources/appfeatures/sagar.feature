Feature: Signup Functionality
Scenario Outline: Signup to application with multiple test data
Given user at signup page
When user enters name "<Name>"
And user enters lastname "<LastName>"
And user enters age <Age>
And user enters his gender as "<Gender>"
Then user will get create

Examples:

| Name | LastName | Age | Gender |
| Deepak | Khetre | 29 | Male |
| Ram | Ram | 27 | Male |

