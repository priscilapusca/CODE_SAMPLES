Feature: Team Policy
 The policy of adding, removing and assigning coach to a team is evaluated

 Scenario: Asign a coach to a team
 Given there is a team
 When there is a coach without team
 Then we can assign the coach to our team

 Scenario: Assign an empty players list to a team
 Given there is a team
 When we have an empty players list assigned to the team
 Then the team should have no players

 Scenario: Add a player to the team
 Given there is a team
 When we add a player to the team
 Then the team size should increase

 Scenario: Add more players to the team
 Given there is a team
 When we add more players to the team
 Then the team should contain them
