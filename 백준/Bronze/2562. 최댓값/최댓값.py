arr = []
for i in range(9):
    arr.append(int(input()))
    
result = 0
cnt = 0

for i in range(9):
    if arr[i] > result:
        result = arr[i]
        cnt = i
        
print(result)
print(cnt+1)