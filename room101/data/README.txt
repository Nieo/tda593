# To write you own custom structures for the hotel, add a .txt file to the same folder as this README.
# Use # in the start of the line for comments.
# Below is the different things you can write and the format of it:
# -----------------------------------------------------------
# 'addroomattribute $ <name of attribute> $ <description of the attribute>'
# For example: addRoomAttribute $ Seaview $ You can see the sea from here
# -----------------------------------------------------------
# 'addroomtype $ <name of type> $ <price per night> $ <attribute 1> $ <attribute 2> $ ...'
# For example: addRoomType $ TV room $ 399 $ Television $ Seaview
# -----------------------------------------------------------
# 'addroom $ <name of room> $ <room type>'
# For example: addRoom $ TV room 1 $ TV room
# -----------------------------------------------------------
# 'addfeedback $ <feedback description> $ <rating>'
# For example: addFeedback $ The room sucked. The window was see-through though which was nice. $ 2
# -----------------------------------------------------------
# 'addsupportticket $ <room name> $ <description>'
# For example: addSupportTicket $ 14B $ The toilet has a very... aggressive return policy.
# -----------------------------------------------------------
# To complete a booking you must:
# 1 - Open the booking with 'newbooking'
# 2 - Add room bookings with 'addroomtobooking'
# 3 - Confirm the booking with 'confirmbooking'
# 'newbooking'
# 'addroomtobooking $ <room type> $ <start date on form yyyy-mm-dd> $ <end date on form yyyy-mm-dd> $ <nbrOfAdults> $ <nbrOfChildren>'
# 'confirmbooking $ <name> $ <phone number> $ <mail> $ <nationality> $ <passportNr> $ <nextDestination>'
# For example:
# newbooking
# addroomtobooking $ TV room $ 2015-01-15 $ 2015-01-20 $ 2 $ 1
# confirmbooking $ Steve Stevenson $ 0123456789 $ steve@stevenet.net $ GB $ 666 $ Saudi Arabia
# -----------------------------------------------------------
# Since some things are references to each other it is important
# that they are written in the correct order, these are:
# 1 - Room attributes
# 2 - Room types
# 3 - Rooms
# 4 - Bookings (New booking -> Add room bookings -> Confirm booking)
# Since the latter references the previous ones.
