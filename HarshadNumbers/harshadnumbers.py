c = 1 #True
n = int(input())-1
while c:
    n += 1
    l = [int(i) for i in str(n)]
    s = 0
    for i in l:
        s+=i
    c = n % s 
    
print(n)