import sys
input = sys.stdin.readline

n = int(input())
rest = 1000 - n
moneys = [500, 100, 50, 10, 5, 1]
result = 0

for money in moneys:
    if rest == 0:
        break
        
    result += rest // money
    rest %= money
    
print(result)