
board = Array.new(256) {Array.new(256, 0)}

File.open(ARGV[0]).each_line do |line|
	command = line.split(" ")
	if(command[0].eql?"SetCol")
		#for all elements in col
		(0...256).each do |row|
			board[row][command[1].to_i] = command[2].to_i
		end
	elsif(command[0].eql?"SetRow")
		#for all elements in row
		(0...256).each do |col|
			board[command[1].to_i][col] = command[2].to_i
		end
	elsif(command[0].eql?"QueryCol")
		sum = 0
		#for all elements in col
		(0...256).each do |row|
			sum = sum + board[row][command[1].to_i]
		end
		puts sum
	elsif(command[0].eql?"QueryRow")
		sum = 0
		#for all elements in row
		(0...256).each do |col|
			sum = sum + board[command[1].to_i][col]
		end
		puts sum
	end
end