File.open(ARGV[0]).each_line do |line|
	command = line.split(",")
	str = command[0]
	c = command[1][0]
	index = str.rindex(c)
	if(index == nil)
		index = -1
	end

	puts index
end