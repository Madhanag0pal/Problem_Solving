c = TRUE
n = gets.to_i-1
while c
    n += 1
    x,a,n1 = [],0,n.to_s
    for i in 0...n1.size
        x.append(n1[i].to_i)
    end
    x.each{|i| a += i}
    c = n % a != 0
end
print n