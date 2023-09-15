import time

def intro():
    print("Welcome to the Adventures of Mr. Big - The Caveman Web Developer!")
    print("You are Mr. Big, a passionate web developer from the last century.")
    print("You live in your cozy cave called 'Wohnzimmer' and love to annoy your students.")
    print("Your goal is to have fun and be a mischievous caveman!")
    input("Press Enter to start your adventure...")

def cave():
    print("\nYou are inside your cave 'Wohnzimmer'. It's dark and cozy.")
    print("You have various tools from the last century web development.")
    print("You hear your students approaching. What would you like to do?")
    print("1. Annoy your students")
    print("2. Explore your cave")
    print("3. Exit")
    choice = input("Enter your choice: ")

    if choice == "1":
        annoy_students()
    elif choice == "2":
        explore_cave()
    elif choice == "3":
        print("\nGoodbye, Mr. Big! See you next time.")
        exit()
    else:
        print("Invalid choice. Please try again.")
        cave()

def annoy_students():
    print("\nYou decide to annoy your students by writing HTML on the cave walls.")
    print("Your students are bewildered and frustrated.")
    print("You enjoy their reaction and laugh heartily.")
    time.sleep(2)
    print("Your students eventually leave your cave in frustration.")
    time.sleep(1)
    print("You've successfully annoyed your students!")
    cave()

def explore_cave():
    print("\nYou start exploring your cave 'Wohnzimmer'.")
    print("You find some old web development books and a vintage computer.")
    print("You reminisce about the good old days of web development.")
    print("While exploring, you discover a hidden passage.")
    print("Do you want to go through the passage?")
    print("1. Go through the passage")
    print("2. Return to the cave")
    choice = input("Enter your choice: ")

    if choice == "1":
        secret_passage()
    elif choice == "2":
        cave()
    else:
        print("Invalid choice. Please try again.")
        explore_cave()

def secret_passage():
    print("\nYou venture into the hidden passage and find yourself in a treasure room.")
    print("There's a chest filled with ancient web development tools and resources.")
    print("You collect the treasures and feel triumphant.")
    time.sleep(2)
    print("You decide to return to your 'Wohnzimmer' cave with your newfound treasures.")
    time.sleep(1)
    print("Congratulations, Mr. Big! You've successfully explored the secret passage.")
    cave()

if __name__ == "__main__":
    intro()
    cave()

