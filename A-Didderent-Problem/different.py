f = True
while f:
    try:
        l = list(map(lambda a:int(a),input().split()))
    except EOFError as e:
        f = False
        continue
    # print(l[0]-l[1] if l[0] > l[1] else l[1] - l[0])
    print(abs(l[0] - l[1]))