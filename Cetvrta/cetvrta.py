x,y = [],[]
for i in range(3):
    p = input().split();
    x += [int(p[0])]
    y += [int(p[1])]
print([[x[1],x[0]][x[1] == x[2]],x[2]][x[0] == x[1]],[[y[1],y[0]][y[1] == y[2]],y[2]][y[0] == y[1]])