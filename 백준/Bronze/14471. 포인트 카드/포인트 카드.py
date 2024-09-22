N,M = map(int, input().split()) # 포인트 카드에 2N개의 칸이 있고 M장의 포인트 카드를 가지고 있음
 
card = []
cnt = 0     # 경품을 얻을 수 있는 카드의 개수를 카운트
 
for _ in range(M):
    A, B = (map(int, input().split()))    # A개의 당첨도장와 B개의 꽝 도장이 찍혀있음
    if A < N: 
        card.append([A, B])
    else:
        cnt += 1
 
card.sort(reverse=True)
 
result = 0
if (M-1) == cnt:
    print(0)
else:
    for i in range(M-1-cnt):
        result += (N - card[i][0])
    print(result)