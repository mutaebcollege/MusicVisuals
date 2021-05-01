# Music Visualiser Project

Name: Mutaeb Alqahtani

Student Number: D18127122

# Description of the assignment

The first time I cloned this repo I did not see myself putting the time to work hard but then I enjoyed what I was doing so I tried to create something cool. I first coded two spheres with a box but then it was a simple code and with no logic behind it. Therefore, I decided that the first visual for this is going to be a clone of the Mac wallpaper when it's in sleep mode. I got inspired by how they make colors travel from one side of the screen to the other side. Then the second visual I coded was the loading visual. This piece of visual is very common in iOS development when you are trying to fetch or load data from an API. Therefore, I decided to make it the default visual for this project. Lastly, is the circle part where I drew two half circles which respond to the amplitude of the music because I thought it would be cool since my previous visuals don't respond to music.

# Instructions

As far as instructions go, there are not many. First, you can clone or fork the repo. Second, make sure you have java installed on your machine. Lastly, just run the compile.sh then run.sh if you are on Windows and on a mac run mcompile.sh and mrun.sh, this will compile the code then run it for you. After you run the script a window will open up and you can select from 0 to 4. 0 is the default visual and pressing on 1 will change the visual and so on. pressing 0 to 4 will present the relevant visual.

# How it works

First there are two files that are not in use, it was for me to play around with which is the SphereWBox.java file and Brainstorming.java file. I used those to play around and make sure I know what was going on in the project. MainVisual is the main dish in the code that has the object of the loading, wall paper, and music. MainVisual loads the music and it has a switch statement that changes the visuals. I also have a UI.java which is an interface file which has a method called run. This file is the implementation for each visual.

The loading class is a progress bar that runs for ever. This class as I said it implements the UI which most of the code will be in the run method. What I did is simple but at the same time complex to understand. I drew a rect which will translate by half of the width and the height of the screen since its 800. Then I rotate the rect which gives that effect when you draw an ellipse as shown in figure 1.

The second class is the wall paper which simlate the MacBook wallpaper when it sleeps. This class also implements the UI interface. In this class I have x1 and y1 and both they have a random value of 0 to 500, this means that the x1 and y1 they can start from 0 to 500 depends on the random value. ie x1 goes from 0 to 500 of the width of the screen and y1 will go on the y axis. for x2 and y2 this is a random increment that will be used to increment the x1 and y1. This increment will make the bezierPoint to move from the previous point to the next incremented point. in the run function i increment the array by the random increments and what i did then is to make sure that any x1 or y1 that they don't go below 0 and beond the screen size. This make sures that the visual says in the 800x800 screen. Lastly, I took this code from the https://processing.org/reference/bezierPoint_.html processing reference which shows how to draw the ellipse. ONE more thing, in the MainVisual.java file I set blendMode() to ADD for the case 1. This make sure that it blends the pixels in the display window. https://processing.org/reference/blendMode_.html

The third class, which is based on two half circles which the second half circle is a mirrored version of the first half circle. First thing is I calculate the amplitude which will be used to controll the movement of the circles and the change of colors. Second I loop through the 30 circle which first I calcuate the theta of each circle by taking theta and subtracting each circle by maping it from 0 to 30 and 0 to pi (half a circle). This then is used to find the sine value. Then I calculate the arc of each circle since sine value is based on each circle, which means I can map it from -1 to 1 to half a circle - a full circle. -1 to 1, this actully will never go below zero, I just don't have the range where I want to start and stop. I also calculate the color by using the sine but instead the range is from 0 to 255 since its I'm dealing wiht colors now. In the switch statemnet you can see depends on the state of c which is an enum I show which arc to disply. LEFT enum will display the first arc and RIGHT will display the second arc. Lastly, the BOTH will display both arc at the same time which displays a cool visual. Then I add the amp to theta which will then determine the speed and the color change of each arc.

# What I am most proud of in the assignment

I proud that I decided to make sure this project unique and not to just modify the code that was provided in the class which in the beinging I planed to do and get a passing grade. But something in me said no and this tunred out very well for me.

# Markdown Tutorial

This is _emphasis_

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings

## Headings

#### Headings

##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](https://i.ytimg.com/an_webp/0IWaRXNK6ww/mqdefault_6s.webp?du=3000&sqp=CMCWs4QG&rs=AOn4CLCLc2SWQZVhLO8Sku26lQgf96UMQQ)](https://www.youtube.com/watch?v=0IWaRXNK6ww)
