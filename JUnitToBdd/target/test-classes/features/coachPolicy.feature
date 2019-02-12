Feature: Coach Policy
 The coach profile is based on reputation and age

 Scenario Outline: Coach profile policy
  Given we have a football coach
  When the coach profile is evaluated with <age> and <reputation>
  Then the profile of the coach should be <profile>

  Examples:
  | age | | reputation | | profile |
  | 35  | | GREAT      | | 6500    |
  | 40  | | GREAT      | | 6000    |
  | 40  | | VERY GOOD  | | 4500    |
  | 50  | | GOOD       | | 2500    |



