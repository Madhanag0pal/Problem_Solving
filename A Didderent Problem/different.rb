f = true
while f
    a = gets
    if a == nil
        f = false
    else
        a = a.split.map(&:to_i)
        puts (a[0]-a[1]).abs
    end
end