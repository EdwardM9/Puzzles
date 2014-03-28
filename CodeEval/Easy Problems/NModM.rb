File.open(ARGV[0]).each_line do |line|
	command = line.split(",")
	n = command[0].to_i
	m = command[1].to_i
	puts n - (m *(n / m))
end