score_one = int(input("Enter score for team one: "))
score_two = int(input("Enter score for team one: "))

has_ball = str(input("Is the team ahead with the ball? Y or N: "))
seconds_left = float(input("How many seconds are left in the game?: "))


diff = abs(score_two - score_one)
#print(diff)
diff -= 3
#print(diff)


if has_ball == "Y":
    diff += 0.5
else:
    diff -= 0.5

diff = diff**2
print(diff)
if (diff > seconds_left):
    print("Team ahead is safe")
else:
    print("Team ahead is not safe")


