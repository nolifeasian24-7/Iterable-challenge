def start():
    A = {}
    B = {}
    while True:
        getInput =str(input("please enter A or B, type end to cancel."))
        if getInput == "A":
            inputA = int(input("enter a random number- which will not be included- followed by a key(identifier) and value (your desired number) to put in dictionary A"))
            for i in range(inputA):
                keys = int(input()) 
                values = int(input()) 
                A[keys] = values
                print(A)
                start()
        if getInput == "B":
            inputB = int(input("enter a random number- which will not be included- followed by a key (identifier) and value (your desired number) to put in dictionary B"))
            for i in range (inputB):
                keys = int(input())
                values = int(input()) 
                B[keys] = values
                print(B)
                start()
        elif getInput == "end":
            exit()
while True:
    start()