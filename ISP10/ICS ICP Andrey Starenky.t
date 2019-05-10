% Andrey Starenky
% May 25th, 2018
% Mr Rosen
% This program is a car maker that allows a user to modify and customize a car

% Import Section
import GUI

% Decleration Section
var makeButton1, makeButton2, makeButton3, modelButton1, modelButton2, modelButton3, colourButton1, colourButton2, colourButton3 : int %These variables are buttons
var doorButton1, doorButton2, doorButton3, bumperButton1, bumperButton2, bumperButton3, hubCapButton1, hubCapButton2, hubCapButton3 : int %These variables are buttons
var licenseButton1, licenseButton2, licenseButton3 : int %These variables are buttons
var carMake, carModel, carDoor, carBumper, carHubCap, carLicense : int := 1 %These are the default settings/choices for modifications
var carColour : int := 9 %This is the default colour of the car
var menuButton, instrButton, startButton, exitButton : int %These variables are buttons
var windId : int := Window.Open ("offscreenonly")

% Forward Procedure
forward proc userInput
forward proc mainMenu

% Procedures
proc title  % This porceudre clears the screen and adds a title
    cls
    put "" : 36, "Car Maker"
end title

process truckHorn  % This process plays the trunk honk sound
    Music.PlayFile ("Truck horn.mp3") %truck honk sound
end truckHorn

process selectSound % This process plays the item selecting sound
    Music.PlayFile ("Car selection.mp3") %item select sound
end selectSound

proc display  % This procedure updates the view of the car
    title
    % Updates car model
    if carModel = 1 then
	% Side view
	drawbox (50, 50, 250, 100, 7)
	for x : 1 .. 3
	    drawline (179, 130, 200 - x, 101, 11)
	end for
	for x : 1 .. 3
	    drawline (180 - x, 130, 199, 101, 11)
	end for
	drawline (176, 130, 196, 100, 7)
	drawline (100, 100, 120, 130, 7)
	drawline (180, 130, 120, 130, 7)
	drawline (180, 130, 200, 100, 7)
	%wheels area outline
	drawarc (95, 50, 21, 21, 0, 185, 7)
	drawarc (220, 50, 21, 21, 0, 185, 7)
	%fills
	drawfill (51, 51, carColour, 7)
	drawfill (132, 101, carColour, 7)
	drawline (101, 100, 195, 100, carColour)
	%wheel area
	drawfilloval (95, 50, 20, 20, 0)
	drawfilloval (220, 50, 20, 20, 0)
	%wind shield
	% front view
	drawbox (450, 50, 550, 100, 7)
	%Left Mirror
	drawbox (444, 109, 455, 113, 7)
	drawbox (446, 109, 434, 121, 7)
	drawfillbox (445, 110, 458, 112, carColour)
	drawfillbox (445, 110, 435, 120, carColour)
	%Right Mirror
	drawbox (544, 113, 556, 109, 7)
	drawbox (554, 109, 566, 121, 7)
	drawfillbox (555, 110, 542, 112, carColour)
	drawfillbox (555, 110, 565, 120, carColour)
	% Car body/windhshield
	for x : 0 .. 6
	    drawline (450 + x, 101 + x, 550 - x, 101 + x, carColour)
	    drawline (455, 107, 544, 107, 7)
	end for
	drawline (450, 101, 456, 107, 7)
	drawline (550, 101, 544, 107, 7)
	drawline (455, 107, 460, 137, 7)
	drawline (540, 137, 460, 137, 7)
	drawline (540, 137, 545, 107, 7)
	drawfill (451, 51, carColour, 7)
	drawfill (461, 110, 11, 7)
	%headlights
	drawfilloval (460, 90, 5, 5, 14)
	drawfilloval (540, 90, 5, 5, 14)
	%license plate area
	drawfillbox (475, 53, 528, 61, 0)
	%wheels
	drawfillbox (455, 50, 465, 40, 7)
	drawfillbox (545, 50, 535, 40, 7)
    elsif carModel = 2 then
	% side view
	drawbox (50, 50, 250, 100, 7)
	%windshield
	for x : 1 .. 3
	    drawarc (190, 98, 31 - x, 41 - x, 10, 90, 11)
	    drawarc (191, 98, 31 - x, 41 - x, 10, 90, 11)
	end for
	%frame
	drawline (100, 100, 100, 138, 7)
	drawarc (200, 97, 50, 10, -5, 74, 7)
	drawline (195, 138, 100, 138, 7)
	%wheels area outline
	drawarc (95, 50, 21, 21, 0, 185, 7)
	drawarc (220, 50, 21, 21, 0, 185, 7)
	%windshield outline
	drawarc (190, 98, 27, 37, 9, 91, 7)
	drawarc (190, 98, 31, 41, 9, 91, 7)
	drawline (190, 135, 188, 137, 7)
	%fills
	drawfill (51, 51, carColour, 7)
	drawfill (132, 101, carColour, 7)
	drawline (101, 100, 246, 100, carColour)
	%wheels area
	drawfilloval (95, 50, 20, 20, 0)
	drawfilloval (220, 50, 20, 20, 0)
	%drawfilloval (200, 137, 1, 1, carColour)
	% front view
	drawbox (450, 50, 550, 100, 7)
	%Left Mirror
	drawbox (444, 112, 458, 116, 7)
	drawbox (446, 112, 434, 124, 7)
	drawfillbox (445, 113, 458, 115, carColour)
	drawfillbox (445, 113, 435, 123, carColour)
	%Right Mirror
	drawbox (542, 116, 556, 112, 7)
	drawbox (554, 112, 566, 124, 7)
	drawfillbox (555, 113, 542, 115, carColour)
	drawfillbox (555, 113, 565, 123, carColour)
	% Car Body/Windshield
	for x : 0 .. 9
	    drawline (450 + x, 101 + x, 550 - x, 101 + x, carColour)
	    drawline (458, 110, 541, 110, 7)
	end for
	drawline (450, 101, 459, 110, 7)
	drawline (550, 101, 541, 110, 7)
	drawline (458, 110, 460, 140, 7)
	drawline (540, 140, 460, 140, 7)
	drawline (540, 140, 542, 110, 7)
	drawfill (451, 51, carColour, 7)
	drawfill (465, 115, 11, 7)
	drawfilloval (460, 90, 5, 5, 14)
	drawfilloval (540, 90, 5, 5, 14)
	drawfillbox (455, 50, 465, 40, 7)
	drawfillbox (545, 50, 535, 40, 7)
	%Bumper
	drawline (450, 67, 550, 67, 7)
	drawfill (451, 66, 7, 7)
	%License plate Area
	drawfillbox (475, 53, 528, 61, 0)
    else
	% Side view
	drawbox (50, 50, 250, 100, 7)
	for x : 1 .. 3
	    drawline (179, 130, 200 - x, 101, 11)
	end for
	for x : 1 .. 3
	    drawline (180 - x, 130, 199, 101, 11)
	end for
	drawline (176, 130, 196, 100, 7)
	drawarc (120, 100, 70, 30, 90, 185, 7)
	drawline (50, 100, 50, 95, 7)
	drawline (180, 130, 120, 130, 7)
	drawline (180, 130, 200, 100, 7)
	%fills
	drawfill (51, 51, carColour, 7)
	drawfill (132, 101, carColour, 7)
	drawline (51, 100, 195, 100, carColour)
	%wheels area outline
	drawarc (95, 50, 21, 21, 0, 185, 7)
	drawarc (220, 50, 21, 21, 0, 185, 7)
	%wheel area
	drawfilloval (95, 50, 20, 20, 0)
	drawfilloval (220, 50, 20, 20, 0)
	% front view
	drawbox (450, 50, 550, 100, 7)
	%Left Mirror
	drawbox (444, 109, 455, 113, 7)
	drawbox (446, 109, 434, 121, 7)
	drawfillbox (445, 110, 458, 112, carColour)
	drawfillbox (445, 110, 435, 120, carColour)
	%Right Mirror
	drawbox (544, 113, 556, 109, 7)
	drawbox (554, 109, 566, 121, 7)
	drawfillbox (555, 110, 542, 112, carColour)
	drawfillbox (555, 110, 565, 120, carColour)
	%car body/windshield
	for x : 0 .. 6
	    drawline (450 + x, 101 + x, 550 - x, 101 + x, carColour)
	    drawline (455, 107, 544, 107, 7)
	end for
	drawline (450, 101, 456, 107, 7)
	drawline (550, 101, 544, 107, 7)
	drawline (455, 107, 460, 137, 7)
	drawline (540, 137, 460, 137, 7)
	drawline (540, 137, 545, 107, 7)
	drawfill (451, 51, carColour, 7)
	drawfill (461, 110, 11, 7)
	%headlights
	drawfilloval (460, 90, 5, 5, 14)
	drawfilloval (540, 90, 5, 5, 14)
	%license plate area
	drawfillbox (475, 53, 528, 61, 0)
	%wheels
	drawfillbox (455, 50, 465, 40, 7)
	drawfillbox (545, 50, 535, 40, 7)
    end if
    % Updates car make
    if carMake = 1 then %udates to bmw logo
	Pic.Draw (Pic.FileNew ("bmw logo.jpg"), 488, 71, picMerge)
	for x : 11 .. 16
	    drawoval (498, 83, x, x, carColour)
	    drawoval (499, 83, x, x, carColour)
	end for
    elsif carMake = 2 then %updates to fiat logo
	Pic.Draw (Pic.FileNew ("fiat logo.jpg"), 487, 73, picMerge)
	for x : 11 .. 16
	    drawoval (498, 83, x, x, carColour)
	    drawoval (499, 83, x, x, carColour)
	end for
    elsif carMake = 3 then %updtaes to vw logo
	Pic.Draw (Pic.FileNew ("vw logo.jpg"), 488, 71, picMerge)
	for x : 11 .. 16
	    drawoval (498, 83, x, x, carColour)
	    drawoval (499, 83, x, x, carColour)
	end for
    end if
    % Updates car door
    if carDoor = 1 and (carModel = 1 or carModel = 3) then  % doors for car 1 and 3
	drawfillbox (150, 110, 185, 55, 7)
	drawfilloval (177, 80, 4, 1, 0)
	drawfillarc (150, 110, 35, 13, 0, 88, 11)
    elsif carDoor = 2 and (carModel = 1 or carModel = 3) then
	drawfillbox (150, 110, 185, 55, 7)
	drawfilloval (177, 80, 4, 1, 0)
	drawfillarc (150, 110, 35, 13, 0, 88, 11)
	drawfillbox (115, 110, 145, 55, 7)
	drawfilloval (125, 80, 4, 1, 0)
	drawfillarc (145, 110, 30, 13, 90, 180, 11)
	for x : 0 .. 10
	    drawarc (95, 50, 22 + x, 22 + x, 0, 80, carColour)
	    drawarc (96, 50, 22 + x, 22 + x, 0, 80, carColour)
	end for
	drawfilloval (100, 80, 5, 8, carColour)
    elsif carDoor = 1 and carModel = 2 then % doors for car 2
	drawfillbox (150, 120, 185, 55, 7)
	drawfilloval (177, 85, 4, 1, 0)
	drawfillarc (150, 120, 35, 13, 0, 88, 11)
    else
	drawfillbox (150, 120, 185, 55, 7)
	drawfilloval (177, 85, 4, 1, 0)
	drawfillarc (150, 120, 35, 13, 0, 88, 11)
	drawfillbox (115, 120, 145, 55, 7)
	drawfilloval (125, 85, 4, 1, 0)
	drawfillarc (145, 120, 30, 13, 90, 180, 11)
	for x : 0 .. 10
	    drawarc (95, 50, 22 + x, 22 + x, 0, 80, carColour)
	    drawarc (96, 50, 22 + x, 22 + x, 0, 80, carColour)
	end for
	drawfilloval (100, 80, 5, 8, carColour)
    end if
    % Updates car bumper
    if carBumper = 1 then
	drawbox (250, 50, 255, 70, 7)
	drawfill (251, 51, 7, 7)
	drawline (450, 67, 550, 67, 7)
	drawfill (451, 66, 7, 7)
    elsif carBumper = 2 then
	drawfillarc (250, 60, 10, 9, 270, 90, 7)
	drawline (450, 67, 550, 67, 7)
	drawfill (451, 66, 7, 7)
    elsif carBumper = 3 then
	drawfillbox (250, 50, 265, 55, 7)
	drawfillbox (263, 80, 265, 52, 7)
	drawline (450, 67, 550, 67, 7)
	drawfill (451, 66, 7, 7)
    end if
    % Updates hub cap
    if carHubCap = 1 then
	drawfilloval (95, 50, 15, 15, 7)
	drawfilloval (220, 50, 15, 15, 7)
    elsif carHubCap = 2 then
	drawfilloval (95, 50, 15, 15, 15)
	drawfilloval (220, 50, 15, 15, 15)
	drawfillstar (232, 38, 208, 64, 12)
	drawfillstar (108, 38, 83, 64, 12)
	for x : 13 .. 15
	    drawoval (95, 50, x, x, 7)
	    drawoval (220, 50, x, x, 7)
	end for
    else
	for x : 0 .. 15
	    drawoval (95, 50, x, x, 64 + x)
	    drawoval (220, 50, x, x, 64 + x)
	end for
	for x : 13 .. 15
	    drawoval (95, 50, x, x, 7)
	    drawoval (220, 50, x, x, 7)
	end for
    end if
    % Updates license plate
    drawfillbox (475, 53, 528, 61, 0)
    var font1 : int := Font.New ("serif:6") %fonts for License Plate
    var font2 : int := Font.New ("serif:7")
    if carLicense = 1 then
	Font.Draw ("COOLCARZ", 480, 54, font1, black)
    elsif carLicense = 2 then
	Font.Draw ("ICS20302", 483, 54, font2, black)
    else
	Font.Draw ("ITSAKIWI", 482, 54, font1, black)
    end if
    View.Update
    userInput
end display

proc resetSelections %This procedure resets all the options to default
    fork selectSound
    carColour := 9
    carMake := 1
    carModel := 1
    carDoor := 1
    carBumper := 1
    carHubCap := 1
    carLicense := 1
    display
end resetSelections

proc make1 %This procedure sets the C   ar Make to a value determined by a button that was selected
    carMake := 1
    display
    fork selectSound
end make1

proc make2 %This procedure sets the Car Make to a value determined by a button that was selected
    carMake := 2
    display
    fork selectSound
end make2

proc make3 %This procedure sets the Car Make to a value determined by a button that was selected
    carMake := 3
    display
    fork selectSound
end make3

proc model1 %This procedure sets the Model to a value determined by a button that was selected
    carModel := 1
    display
    fork selectSound
end model1

proc model2 %This procedure sets the Model to a value determined by a button that was selected
    carModel := 2
    display
    fork selectSound
end model2

proc model3 %This procedure sets the Model to a value determined by a button that was selected
    carModel := 3
    display
    fork selectSound
end model3

proc colour1 %This procedure sets the Colour of the car to a value determined by a button that was selected1
    carColour := 9
    display
    fork selectSound
end colour1

proc colour2 %This procedure sets the Colour of the car to a value determined by a button that was selected
    carColour := 12
    display
    fork selectSound
end colour2

proc colour3 %This procedure sets the Colour of the car to a value determined by a button that was selected
    carColour := 10
    display
    fork selectSound
end colour3

proc door1 %This procedure sets the number of doors to a value determined by a button that was selected
    carDoor := 1
    display
    fork selectSound
end door1

proc door2 %This procedure sets the number of doors to a value determined by a button that was selected
    carDoor := 2
    display
    fork selectSound
end door2

proc bumper1 %This procedure sets the Bumper to a value determined by a button that was selected
    carBumper := 1
    display
    fork selectSound
end bumper1

proc bumper2 %This procedure sets the Bumper to a value determined by a button that was selected
    carBumper := 2
    display
    fork selectSound
end bumper2

proc bumper3 %This procedure sets the Bumper to a value determined by a button that was selected
    carBumper := 3
    display
    fork selectSound
end bumper3

proc hubCap1 %This procedure sets the Hub Cap to a value determined by a button that was selected
    carHubCap := 1
    display
    fork selectSound
end hubCap1

proc hubCap2 %This procedure sets the Hub Cap to a value determined by a button that was selected
    carHubCap := 2
    display
    fork selectSound
end hubCap2

proc hubCap3 %This procedure sets the Hub Cap to a value determined by a button that was selected
    carHubCap := 3
    display
    fork selectSound
end hubCap3

proc license1 %This procedure sets License Plate to a value determined by a button that was selected
    carLicense := 1
    display
    fork selectSound
end license1

proc license2 %This procedure sets License Plate to a value determined by a button that was selected
    carLicense := 2
    display
    fork selectSound
end license2

proc license3 %This procedure sets License Plate to a value determined by a button that was selected
    carLicense := 3
    display
    fork selectSound
end license3

body proc userInput %This procedure gathers the inputs from the user through buttons which customize the car
    GUI.Hide (startButton)
    GUI.Hide (instrButton)
    GUI.Hide (exitButton)
    drawfill (1, 300, 3, 7)
    colorback (3)
    locate (1, 36)
    put "Car Maker"
    put ""
    put "" : 24, "Select options to modify the car!"
    put ""
    put "" : 6, "Model" : 18, "Colour" : 25, "Make" : 14, "Number of Doors"
    % Model Options
    modelButton1 := GUI.CreateButton (10, 292, 0, "1", model1)
    modelButton2 := GUI.CreateButton (50, 292, 0, "2", model2)
    modelButton3 := GUI.CreateButton (90, 292, 0, "3", model3)
    % Colour Options
    colourButton1 := GUI.CreateButton (140, 292, 0, "blue", colour1)
    colourButton2 := GUI.CreateButton (195, 292, 0, "red", colour2)
    colourButton3 := GUI.CreateButton (243, 292, 0, "green", colour3)
    % Make Options
    makeButton1 := GUI.CreateButton (315, 292, 0, "BMW", make1)
    makeButton2 := GUI.CreateButton (378, 292, 0, "FIAT", make2)
    makeButton3 := GUI.CreateButton (439, 292, 0, "VW", make3)
    % Doors Options
    doorButton1 := GUI.CreateButton (530, 292, 0, "2", door1)
    doorButton2 := GUI.CreateButton (570, 292, 0, "4", door2)
    locate (8, 1)
    put "" : 6, "Bumper" : 28, "License Plate" : 33, "Hub Cap"
    % Bumper Options
    bumperButton1 := GUI.CreateButton (10, 245, 0, "1", bumper1)
    bumperButton2 := GUI.CreateButton (50, 245, 0, "2", bumper2)
    bumperButton3 := GUI.CreateButton (90, 245, 0, "3", bumper3)
    % License Plate Options
    licenseButton1 := GUI.CreateButton (180, 245, 0, "COOLCARZ", license1)
    licenseButton2 := GUI.CreateButton (282, 245, 0, "ICS20302", license2)
    licenseButton3 := GUI.CreateButton (367, 245, 0, "ITSAKIWI", license3)
    % Hub Cap Options
    hubCapButton1 := GUI.CreateButton (500, 245, 0, "1", hubCap1)
    hubCapButton2 := GUI.CreateButton (547, 245, 0, "2", hubCap2)
    hubCapButton3 := GUI.CreateButton (592, 245, 0, "3", hubCap3)
    var font1 : int := Font.New ("serif:12")
    Font.Draw ("SIDE VIEW", 110, 180, font1, black)
    Font.Draw ("FRONT VIEW", 455, 180, font1, black)
    var menuButton2 : int := GUI.CreateButton (282, 170, 0, "Main Menu", mainMenu)
    var resetButton : int := GUI.CreateButton (296, 130, 0, "Reset", resetSelections)
    View.Update
end userInput

proc instructions %This procedure displays the instructions to the user
    title
    GUI.Hide (startButton)
    GUI.Hide (instrButton)
    GUI.Hide (exitButton)
    locate (3, 1)
    put "This is a car designing game! You can press many buttons which will change the"
    put "" : 11, "features of the car! The car will update as you go. Enjoy!"
    GUI.Show (menuButton)
    View.Update
end instructions

body proc mainMenu %This procedure displays options for the user to select
    colorback(0)
    Music.SoundOff
    title
    locate (7, 10)
    put "*When you start the game, all the options are set to default(1)"
    GUI.Hide (menuButton)
    startButton := GUI.CreateButton (150, 200, 75, "Play Game", display)
    instrButton := GUI.CreateButton (400, 200, 75, "Instructions", instructions)
    exitButton := GUI.CreateButton (275, 100, 75, "Exit", GUI.Quit)
    View.Update
end mainMenu

proc intro %This procedure runs when the user opens the program
    title
    put ""
    put ""
    put "" : 29, "Welcome to Car Maker!"
    put ""
    put "" : 9, "This is a game where you can create and modify your own car"
    put ""
    put "" : 26, "Click the button to continue"
    menuButton := GUI.CreateButton (-130, 50, 0, "Main Menu", mainMenu)
    View.Update
    fork truckHorn
    for x : 0 .. 700
	%animation of truck and button
	%erase
	drawfillbox (-571 + x, 50, -145 + x, 250, 0)
	drawfillbox (-570 + x, 50, -220 + x, 250, 9)
	drawfillbox (-145 + x, 125, -215 + x, 50, 7)
	drawfillbox (-215 + x, 110, -220 + x, 95, 7)
	drawfillbox (-215 + x, 75, -220 + x, 60, 7)
	drawfillbox (-145 + x, 125, -170 + x, 100, 11)
	%frame for wheels
	drawfilloval (-490 + x, 50, 15, 15, 0)
	drawfilloval (-535 + x, 50, 15, 15, 0)
	drawfilloval (-310 + x, 50, 15, 15, 0)
	drawfilloval (-265 + x, 50, 15, 15, 0)
	drawfilloval (-180 + x, 50, 15, 15, 0)
	%wheels
	drawfilloval (-535 + x, 50, 12, 12, 7)
	drawfilloval (-490 + x, 50, 12, 12, 7)
	drawfilloval (-310 + x, 50, 12, 12, 7)
	drawfilloval (-265 + x, 50, 12, 12, 7)
	drawfilloval (-180 + x, 50, 12, 12, 7)
	Font.Draw ("CAR MAKER", -540 + x, 180, Font.New ("comicsans:35:bold"), red)
	GUI.Hide (menuButton)
	drawfillbox (x - 131, 50, x, 73, 0)
	menuButton := GUI.CreateButton (x - 430, 100, 0, "Main Menu", mainMenu)
	delay (3)
	View.Update
	%GUI.Hide(button)
    end for
end intro

proc goodbye %This is the goodbye procedure which exits the program, runs when exit button is pressed
    title
    locate (5, 30)
    put "Thanks for playing!"
    locate (8, 25)
    put "Programmed by Andrey Starenky"
    View.Update
    delay (1500)
    Window.Close (windId)
end goodbye

%Main Program
intro
loop
    exit when GUI.ProcessEvent
end loop
goodbye
%End of program
