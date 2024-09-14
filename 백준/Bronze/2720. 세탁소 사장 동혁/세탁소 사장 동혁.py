def coin_change(cents):
    coins = [25, 10, 5, 1]  # 센트 단위로 표현된 동전 가치
    change = []
    
    for coin in coins:
        count = cents // coin
        change.append(str(count))
        cents %= coin
    
    return ' '.join(change)

T = int(input())  # 테스트 케이스의 수

for _ in range(T):
    cents = int(input())  # 센트 단위로 직접 입력받음
    print(coin_change(cents))