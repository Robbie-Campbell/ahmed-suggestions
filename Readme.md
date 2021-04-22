# Hello Ahmed!

# I have made some major changes to the application, and you may not want to keep them, but here they are:

### 1. Biggest change here: I have removed the interface. :coffin:
> So my reasoning for this is to simplify what you do have in the project, i was struggling to wrap my head around the classes when they had to implement the methods, the simple solution was to get rid of it altogether. You may want to add it back if you feel like its neccessary but at present it works fairly well.

### 2. Moved Book out of the Paper class, now it inherits publication :building_construction:
> By doing this there is a purpose to having two seperate superclasses in the application. Book inherits from a superclass which does not contain the information regarding the issue number, everything else from the paper class.

### 3. Changed the order of the super and main class :recycle:
> Very simple one here: The super class now matches with the main class in terms of order, making it alot more readable.

### 4. Removed the Availability enum :heavy_minus_sign:
> Optional removal here, just replaced it with a boolean value instead for whether or not it is available.

### 5. Removed all of the inherited methods from the child classes :wastebasket:
> Wrote all of the methods in a superclass, nothing really major here except for keeping the code dry.

### 6. Added an Author ArrayList to the Constructor of the Publication class :heavy_plus_sign:
> Whenever making any of the objects, you have to declare all of the authors in the constructor. Also as a side note i removed the getAuthorName methods because these are available inside of author already, if you want to get their names call the method from the author object.

### 7. Corrected getter and setter methods :hammer:
> They now function correctly

# That is about it, there may be a few other things here and there, but here are some suggesions for potential additions:

### 1. Add some more unique characteristics for child classes :arrow_up:
> Add special variables for each of the classes

### 2. Override parent methods :monocle_face:
> Make the methods defined in the parent class unique to the child classes

### 3. Get the javadocs in! :bulb:
> Javadoc every method in the application, look it up, it's not too bad really.

### 4. Get them tests sorted in main :alembic:
> Just get some good test cases ready for the documentation.

# :shipit: Hope this helps Ahmed, happy coding bro!!! :shipit: