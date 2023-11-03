# Simple Mobilcom Debitel Contract Game

def main():
    print("Welcome to the Mobilcom Debitel Contract Game!")
    print("Answer the following questions correctly to win a fantastic contract!")

    questions = [
        {"question": "How much data is included in the contract for 9.99 euros per month?",
         "answer": "20 GB"},
        {"question": "What is the name of the Internet service provider?",
         "answer": "Mobilcom Debitel"},
    ]

    score = 0

    for question in questions:
        print("\nQuestion:", question["question"])
        user_answer = input("Your answer: ").strip()
        if user_answer.lower() == question["answer"].lower():
            print("Correct! You got a point.")
            score += 1
        else:
            print("Oops, that's not correct.")

    print("\nCongratulations! You answered", score, "out of", len(questions), "questions correctly.")
    if score == len(questions):
        print("You've won a fantastic Mobilcom Debitel contract!")
    else:
        print("Keep trying for a perfect score!")

if __name__ == "__main__":
    main()
