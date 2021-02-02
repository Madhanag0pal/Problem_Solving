C = float(input())
if(0 < C and C <= 100):
    L = int(input())
    if(0 < L and L <= 100):
        a = 0
        for i in range(L):
            w,l = input().split()
            a += float(w) * float(l)
        print("{:.7f}".format(a*C))