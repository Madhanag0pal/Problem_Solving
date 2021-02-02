x,y = [],[]
for i in 1..3
    p = gets.split.map(&:to_i);
    x.append(p[0])
    y.append(p[1])
end
print (x[0] == x[1])? x[2]: (x[1] == x[2])?x[0]:x[1] , " " , (y[0] == y[1])? y[2]: (y[1] == y[2])? y[0]:y[1]