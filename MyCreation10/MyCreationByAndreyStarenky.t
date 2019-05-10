% Andrey Starenky
% Mr Rosen
% Friday, April 5th, 2018
% This program outputs a whale eating fish and then getting defeated by a small fish

process music1    %this music is used in the intro
    play ("c4,e4,g4,a4,b4,>e4,d4,f4,f1,f1")
end music1

process music2    %this music is used during the main animation
    play ("<>4a,4c,4e,4a,2g,4g,4e,2f,4f,4d,1e,<4e,4g,4b,>4d,2c,>4c,4c,1c<,4a,4c,4e,4a,2g,4g,4e,2f,4f,4d,1e,4e,4f,4g,4a,1b,2e,4d,1e,<4a,4b,>1c,1d,<4b,1a,>>>4c,4c,1c")
end music2

process music3    %these notes are played in the last scene
    delay (500)
    play ("<4c,4g,>1c")
end music3

procedure intro                                              %this is the intro screen
    fork music1                                              %this forks the music
    for x : 0 .. 640
	drawline (x, 0, x, 400, 12)
    end for
    Font.Draw ("My Creation", 200, 300, Font.New ("serif:35:bold"), 54)
    Font.Draw ("By: Andrey Starenky", 220, 250, Font.New ("serif:17:bold"), 54)
    delay (4000)
end intro

procedure background
    for x : 0 .. 640                                          %this draws the background
	drawline (x, 40, x, 0, 90)                            %this is the water and sand
	drawline (x, 41, x, 400, 54)
    end for
    Draw.ThickLine (25, 50, 20, 40, 3, 10)                    %this draws the grass
    Draw.ThickLine (45, 50, 40, 40, 3, 10)
    Draw.ThickLine (65, 50, 60, 40, 3, 10)
    Draw.ThickLine (85, 50, 80, 40, 3, 10)
    Draw.ThickLine (105, 50, 100, 40, 3, 10)
    for x : 0 .. 30                                           %this draws the rocks
	drawarc (300, 30, 30, x, 0, 180, 15)
	drawarc (300, 31, 30, x, 0, 180, 15)
	drawarc (540, 30, 50, x, 0, 180, 15)
	drawarc (540, 30, 50, 20 + x, 0, 180, 15)
	drawarc (540, 31, 50, 20 + x, 0, 180, 15)
    end for
end background

procedure background2
    fork music3
    for x : 0 .. 640                                          %this draws the background
	drawline (x, 40, x, 0, 90)                            %this is the water and sand
	drawline (x, 41, x, 400, 54)
    end for
    Draw.ThickLine (25, 50, 20, 40, 3, 10)                    %this draws the grass
    Draw.ThickLine (45, 50, 40, 40, 3, 10)
    Draw.ThickLine (65, 50, 60, 40, 3, 10)
    Draw.ThickLine (85, 50, 80, 40, 3, 10)
    Draw.ThickLine (105, 50, 100, 40, 3, 10)
    Draw.ThickLine (545, 50, 540, 40, 3, 10)
    Draw.ThickLine (545, 50, 540, 40, 3, 10)
    Draw.ThickLine (565, 50, 560, 40, 3, 10)
    Draw.ThickLine (585, 50, 580, 40, 3, 10)
    Draw.ThickLine (605, 50, 600, 40, 3, 10)
    Draw.ThickLine (320, 40, 320, 150, 6, 6)                   %this draws the sign
    drawfillbox (220, 250, 420, 150, 6)
    Font.Draw ("Congratulations!", 235, 225, Font.New ("serif:17:bold"), 0)     %this is the text on the sign
    Font.Draw ("You have defeated", 228, 195, Font.New ("serif:17:bold"), 0)
    Font.Draw ("The Great Whale", 235, 165, Font.New ("serif:17:bold"), 0)
end background2

procedure pufferFishSwim
    for x : 0 .. 100
	drawfillbox (-57 + x, 204, -4 + x, 256, 54)            %erase
	drawfilloval (-30 + x, 230, 15, 15, 42)                %body
	drawfillarc (-30 + x, 230, 26, 26, 29, 31, 42)         %spikes
	drawfillarc (-30 + x, 230, 26, 26, 59, 61, 42)
	drawfillarc (-30 + x, 230, 26, 26, 114, 116, 42)
	drawfillarc (-30 + x, 230, 26, 26, 144, 146, 42)
	drawfillarc (-30 + x, 230, 26, 26, 209, 211, 42)
	drawfillarc (-30 + x, 230, 26, 26, 239, 241, 42)
	drawfillarc (-30 + x, 230, 26, 26, 299, 301, 42)
	drawfillarc (-30 + x, 230, 26, 26, 329, 331, 42)
	drawline (-30 + x, 256, -30 + x, 204, 42)
	drawline (-56 + x, 230, -4 + x, 230, 42)
	drawfillarc (-30 + x, 227, 7, 5, 180, 0, 40)           %mouth and eyes
	drawbox (-35 + x, 235, -33 + x, 233, 0)
	drawbox (-25 + x, 235, -27 + x, 233, 0)
	delay (5)
    end for
    Font.Draw ("I must feed", 30, 290, Font.New ("serif:14"), 40)  %this is what the fish says
    Font.Draw ("The whale", 30, 270, Font.New ("serif:14"), 40)
    delay (1500)
    drawfillbox (30, 310, 115, 250, 54)
    for x : 0 .. 160
	drawfillbox (43 + x, 204, 94 + x, 256, 54)             %erase
	drawfilloval (70 + x, 230, 15, 15, 42)                 %body
	drawfillarc (70 + x, 230, 26, 26, 29, 31, 42)          %spikes
	drawfillarc (70 + x, 230, 26, 26, 59, 61, 42)
	drawfillarc (70 + x, 230, 26, 26, 114, 116, 42)
	drawfillarc (70 + x, 230, 26, 26, 144, 146, 42)
	drawfillarc (70 + x, 230, 26, 26, 209, 211, 42)
	drawfillarc (70 + x, 230, 26, 26, 239, 241, 42)
	drawfillarc (70 + x, 230, 26, 26, 299, 301, 42)
	drawfillarc (70 + x, 230, 26, 26, 329, 331, 42)
	drawline (70 + x, 256, 70 + x, 204, 42)
	drawline (44 + x, 230, 94 + x, 230, 42)
	drawfillarc (70 + x, 227, 7, 5, 180, 0, 40)            %mouth and eyes
	drawbox (65 + x, 235, 67 + x, 233, 0)
	drawbox (75 + x, 235, 73 + x, 233, 0)
	delay (5)
    end for
end pufferFishSwim

procedure fish1Swim
    fork music2                                                %this draws the fish moving
    for x : 0 .. 100
	drawfillbox (0 + x, 260, -91 + x, 200, 54)             %draw the erase
	drawline (-30 + x, 230, -90 + x, 250, 7)               %tail
	drawline (-30 + x, 230, -90 + x, 210, 7)
	drawline (-90 + x, 210, -90 + x, 250, 7)
	drawfilloval (-30 + x, 230, 30, 30, 11)                %body
	drawoval (-30 + x, 230, 30, 30, 7)
	drawfillbox (-20 + x, 240, -15 + x, 235, 3)            %eye and mouth
	drawarc (-10 + x, 235, 20, 20, 220, 290, 7)
	Draw.Fill (-65 + x, 230, 12, 7)                        %fill for tail
	delay (5)
    end for
    Font.Draw ("I must feed", 30, 290, Font.New ("serif:14"), 40)   %this is what the fish says
    Font.Draw ("The whale", 30, 270, Font.New ("serif:14"), 40)
    delay (1500)
    drawfillbox (30, 310, 115, 250, 54)
    for x : 0 .. 160
	drawfillbox (100 + x, 260, 9 + x, 200, 54)             %draw the erase
	drawline (70 + x, 230, 10 + x, 250, 7)                 %tail
	drawline (70 + x, 230, 10 + x, 210, 7)
	drawline (10 + x, 210, 10 + x, 250, 7)
	drawfilloval (70 + x, 230, 30, 30, 11)                 %body
	drawoval (70 + x, 230, 30, 30, 7)
	drawfillbox (80 + x, 240, 85 + x, 235, 3)              %eye and mouth
	drawarc (90 + x, 235, 20, 20, 220, 290, 7)
	Draw.Fill (35 + x, 230, 12, 7)                         %fill for tail
	delay (5)
    end for
end fish1Swim

procedure fish2Swim
    for x : 0 .. 100
	drawfillbox (-76 + x, 260, 0 + x, 200, 54)             %erase
	drawline (0 + x, 230, -40 + x, 260, 7)                 %fins
	drawline (0 + x, 230, -40 + x, 200, 7)
	drawline (-40 + x, 200, -40 + x, 230, 7)
	drawline (-40 + x, 260, -40 + x, 230, 7)
	drawfillbox (-45 + x, 233, -75 + x, 227, 12)           %tail
	drawbox (-45 + x, 233, -75 + x, 227, 7)
	drawfilloval (-30 + x, 230, 30, 15, 120)               %body
	drawoval (-30 + x, 230, 30, 15, 7)
	drawfillbox (-20 + x, 240, -15 + x, 235, 30)           %eye and mouth
	drawarc (-10 + x, 205, 20, 20, 70, 130, 7)
	Draw.Fill (-30 + x, 250, 12, 7)                        %fill for fins
	Draw.Fill (-30 + x, 210, 12, 7)
	delay (5)
    end for
    Font.Draw ("I must feed", 30, 290, Font.New ("serif:14"), 40)   %text that the fish says
    Font.Draw ("The whale", 30, 270, Font.New ("serif:14"), 40)
    delay (1500)
    drawfillbox (30, 310, 115, 250, 54)
    for x : 0 .. 160
	drawfillbox (24 + x, 260, 100 + x, 200, 54)            %erase
	drawline (100 + x, 230, 60 + x, 260, 7)                %fins
	drawline (100 + x, 230, 60 + x, 200, 7)
	drawline (60 + x, 200, 60 + x, 230, 7)
	drawline (60 + x, 260, 60 + x, 230, 7)
	drawfillbox (55 + x, 233, 25 + x, 227, 12)             %tail
	drawbox (55 + x, 233, 25 + x, 227, 7)
	drawfilloval (70 + x, 230, 30, 15, 120)                %body
	drawoval (70 + x, 230, 30, 15, 7)
	drawfillbox (80 + x, 240, 85 + x, 235, 30)             %eye and mouth
	drawarc (90 + x, 205, 20, 20, 70, 130, 7)
	Draw.Fill (70 + x, 250, 12, 7)                         %fill for fins
	Draw.Fill (70 + x, 210, 12, 7)
	delay (5)
    end for
end fish2Swim

procedure fish3Swim
    for x : 0 .. 100                                           %erase
	drawfillbox (-80 + x, 245, 0 + x, 215, 54)
	drawline (-10 + x, 230, -70 + x, 240, 7)               %tail
	drawline (-10 + x, 230, -70 + x, 220, 7)
	drawline (-60 + x, 230, -70 + x, 240, 7)
	drawline (-70 + x, 220, -60 + x, 230, 7)
	drawfilloval (-30 + x, 230, 30, 15, 36)                %body
	drawoval (-30 + x, 230, 30, 15, 7)
	drawfillbox (-20 + x, 240, -15 + x, 235, 9)            %eye and mouth
	drawarc (-12 + x, 225, 10, 1, 180, 0, 7)
	Draw.Fill (-59 + x, 235, 28, 7)                        %fill for tail
	Draw.Fill (-59 + x, 225, 28, 7)
	drawline (-32 + x, 235, -28 + x, 235, 7)               %gills
	drawline (-42 + x, 235, -38 + x, 235, 7)
	drawline (-32 + x, 225, -28 + x, 225, 7)
	drawline (-42 + x, 225, -38 + x, 225, 7)
	delay (5)
    end for
    Font.Draw ("I must feed", 30, 290, Font.New ("serif:14"), 40)
    Font.Draw ("The whale", 30, 270, Font.New ("serif:14"), 40)
    delay (1500)
    drawfillbox (30, 310, 115, 250, 54)
    for x : 0 .. 160
	drawfillbox (20 + x, 245, 100 + x, 215, 54)      %erase
	drawline (90 + x, 230, 30 + x, 240, 7)           %tail
	drawline (90 + x, 230, 30 + x, 220, 7)
	drawline (40 + x, 230, 30 + x, 240, 7)
	drawline (30 + x, 220, 40 + x, 230, 7)
	drawfilloval (70 + x, 230, 30, 15, 36)           %body
	drawoval (70 + x, 230, 30, 15, 7)
	drawfillbox (80 + x, 240, 75 + x, 235, 9)        %eye and mouth
	drawarc (88 + x, 225, 10, 1, 180, 0, 7)
	Draw.Fill (41 + x, 235, 28, 7)                   %fill for tail
	Draw.Fill (41 + x, 225, 28, 7)
	drawline (68 + x, 235, 72 + x, 235, 7)           %gills
	drawline (58 + x, 235, 62 + x, 235, 7)
	drawline (68 + x, 225, 72 + x, 225, 7)
	drawline (58 + x, 225, 62 + x, 225, 7)
	delay (5)
    end for
end fish3Swim

procedure fish4Swim
    for x : 0 .. 100
	drawfillbox (-56 + x, 245, -15 + x, 215, 54)     %erase
	drawline (-35 + x, 230, -50 + x, 230, 7)         %tail
	drawline (-50 + x, 225, -50 + x, 235, 7)
	drawline (-55 + x, 230, -50 + x, 235, 7)
	drawline (-50 + x, 225, -55 + x, 230, 7)
	drawfilloval (-20 + x, 230, 15, 15, 100)          %body
	drawfillbox (-15 + x, 240, -10 + x, 235, 3)       %eye and mouth
	drawarc (-15 + x, 225, 10, 1, 180, 0, 7)
	Draw.Fill (-51 + x, 230, 85, 7)                   %fill for tail
	delay (5)
    end for
    Font.Draw ("I will not feed", 30, 290, Font.New ("serif:14"), 40)   %this is the fish talking
    Font.Draw ("  The whale", 30, 270, Font.New ("serif:14"), 40)
    delay (1500)
    drawfillbox (30, 310, 135, 250, 54)
    for x : 0 .. 203                                     %it chases the whale ofscreen
	drawfillbox (44 + x, 245, 85 + x, 215, 54)       %erase
	drawline (65 + x, 230, 50 + x, 230, 7)           %tail
	drawline (50 + x, 225, 50 + x, 235, 7)
	drawline (45 + x, 230, 50 + x, 235, 7)
	drawline (50 + x, 225, 45 + x, 230, 7)
	drawfilloval (80 + x, 230, 15, 15, 100)           %body
	drawfillbox (85 + x, 240, 90 + x, 235, 3)        %eye and mouth
	drawarc (85 + x, 225, 10, 1, 180, 0, 7)
	Draw.Fill (49 + x, 230, 85, 7)                    %fill for tail
	delay (2)
    end for
end fish4Swim

procedure fish4Swimoff
    for x : 0 .. 410
	drawfillbox (247 + x, 245, 288 + x, 215, 54)     %tail
	drawline (268 + x, 230, 253 + x, 230, 7)         %tail
	drawline (253 + x, 225, 253 + x, 235, 7)
	drawline (248 + x, 230, 253 + x, 235, 7)
	drawline (253 + x, 225, 248 + x, 230, 7)
	drawfilloval (283 + x, 230, 15, 15, 100)          %body
	drawfillbox (288 + x, 240, 293 + x, 235, 3)      %eye and mouth
	drawarc (288 + x, 225, 10, 1, 180, 0, 7)
	Draw.Fill (249 + x, 230, 85, 7)                   %fill for tail
	delay (2)
    end for
end fish4Swimoff

procedure fish4Swimin2                                  %this is the second time fish4 swims on
    for x : 0 .. 150
	drawfillbox (-56 + x, 245, -15 + x, 215, 54)    %erase
	drawline (-35 + x, 230, -50 + x, 230, 7)        %tail
	drawline (-50 + x, 225, -50 + x, 235, 7)
	drawline (-55 + x, 230, -50 + x, 235, 7)
	drawline (-50 + x, 225, -55 + x, 230, 7)
	drawfilloval (-20 + x, 230, 15, 15, 100)         %body
	drawfillbox (-15 + x, 240, -10 + x, 235, 3)     %eye and mouth
	drawarc (-15 + x, 225, 10, 1, 180, 0, 7)
	Draw.Fill (-51 + x, 230, 85, 7)                  %fill for tail
	delay (10)
    end for
    Font.Draw ("Yay!", 110, 260, Font.New ("serif:14"), 40)
    delay (1000)
end fish4Swimin2


procedure whaleStatic
    for x : 0 .. 200                                      %body
	drawarc (350, 300, x, 50, 0, 180, 11)
	drawarc (350, 170, x, 50, 180, 0, 11)
	drawarc (351, 299, x, 50, 0, 180, 11)
	drawarc (351, 171, x, 50, 180, 0, 11)
    end for
    for x : 0 .. 250
	drawbox (300, 300, 300 + x, 170, 11)
    end for
    for x : 0 .. 60
	drawline (550, 280 - x, 600, 290, 14)             %tail
	drawline (550, 200 + x, 600, 190, 14)
    end for
    for x : 0 .. 35                                       %eye
	drawbox (250, 325, 250 + x, 310, 0)
    end for
    for x : 0 .. 2
	drawoval (255, 315, x, x, 7)
	drawoval (256, 315, x, x, 7)
    end for
end whaleStatic

procedure whaleEat                                              %this animates the whale eating
    for x : 0 .. 65                                             %close mouth
	drawline (150, 300 - x, 300, 300 - x, 11)
	drawline (150, 170 + x, 300, 170 + x, 11)
	delay (10)
    end for
    Font.Draw ("*nom*", 90, 310, Font.New ("serif:14"), 40)
    for x : 0 .. 65                                             %open mouth
	drawline (150, 235 + x, 300, 235 + x, 54)
	drawline (150, 235 - x, 300, 235 - x, 54)
	delay (10)
    end for
    drawfillbox (89, 310, 139, 322, 54)
end whaleEat

procedure whaleHit
    for x : 0 .. 500
	drawfillarc (349 + x, 300, 200, 50, 0, 180, 54)        %erase
	drawfillarc (349 + x, 170, 200, 50, 180, 0, 54)
	drawfillbox (299 + x, 300, 600 + x, 170, 54)
	drawfillarc (350 + x, 300, 200, 50, 0, 180, 11)        %body
	drawfillarc (350 + x, 170, 200, 50, 180, 0, 11)
	drawfillbox (300 + x, 300, 550 + x, 170, 11)
	drawline (550 + x, 280, 600 + x, 290, 14)              %tail
	drawline (550 + x, 200, 600 + x, 190, 14)
	drawline (565 + x, 240, 600 + x, 290, 14)
	drawline (565 + x, 240, 600 + x, 190, 14)
	drawline (550 + x, 280, 550 + x, 200, 14)
	drawfillbox (250 + x, 325, 285 + x, 310, 0)            %eye
	drawfilloval (255 + x, 315, 2, 2, 7)
	Draw.Fill (551 + x, 240, 14, 14)                       %fill for tail
	delay (2)
    end for
end whaleHit

procedure circleIn                                             %circle transition
    delay (1000)
    for decreasing x : 390 .. 0                                %this draws the circles inwards
	drawoval (320, 200, x, x, 7)
	drawoval (321, 200, x, x, 7)
	drawoval (320, 201, x, x, 7)
	delay (5)
    end for
end circleIn

%Main Program
intro
background
whaleStatic
fish1Swim
whaleEat
fish2Swim
whaleEat
pufferFishSwim
whaleEat
fish3Swim
whaleEat
fish4Swim
whaleHit
fish4Swimoff
circleIn
background2
fish4Swimin2
circleIn
%End of Main Program
