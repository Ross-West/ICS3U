package com.bayviewglen.blackjack;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * OOOOOOOOOOOOOOOOOOOOHHH GOOOOOOOOOOOOOOOOOOOOD
 * Right, so how this works is that:
 * 1. User enters their name. IF their name is "quit", print "Thank you for playing!", then STOP
 * 2. Get Locale, display money in selected locale, LOOP if they enter an invalid locale
 * 3. Player starts with 500 money (whatever the locale currency is).
 * 4. Ask player to bet. IF they try to bet more than they have, then tell them "You can't bet more than you have!", and LOOP
 * 5. Deal player 2 cards, Deal dealer 1 card and "XX". 
 * 		>Format for cards is #S (# is number, S is suit), with A, J, K, and Q being numbers for Aces, Jacks, Kings, and Queens
 * 6. Offer the player to Hit, Stay, or Double Down IF they have enough money to Double Down.
 * 7. Once they choose to stay display dealer and player sum
 * 8. Add or subtract money from the bank account. 
 * 9. Offer Player to play again. IF he or she chooses "No", goto 1. If he or she chooses "Yes", goto 4.
 * OTHER NOTES:
 * I never close my scanners. This is intentional. According to Stack Overflow (which helped me fix a bug I document later),
 * Closing a scanner -any scanner, including those closed in methods-
 * Will cause all instances of system.in to close as well,
 * effectively killing all scanners. Thanks, Stack Overflow for saving me much madness.
 */

public class ProjectClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner is never closed because StackOverflow said it helps with some bugs
		boolean Done = false;
		while (!Done) {
			// Locale Locale = getLocale();
			int wallet = 500;
			// TODO Figure out how to make "quit" exit
			System.out.print("Please Enter Your Name: ");
			String name = s.nextLine();
			if (name.equalsIgnoreCase("quit")) {
				Done = true; // Methods didn't work for some reason, doing it
								// manually here.
			}
			NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(getLocale());
			Boolean DonePlaying = false; //Heh
			while (!DonePlaying) {
				int bet = getBet(wallet);
				System.out.println("Hello, " + name + ". You have " + moneyFormatter.format(wallet) + ". Your bet is " + moneyFormatter.format(bet) + ".");
				// Right, so we can actually start the game.
				// Variable for numbers - these are important.
				// So, just for reference:
				// ThrowawayNumbers are suits (suits do not matter in blackjack
				// at
				// all, so we can forget them completely)
				// ThrowawayNumbers 1 and 5, and 6 are dealer
				// Rest are user
				System.out.println("The dealer deals these cards:");
				int DealerNumber1 = (int) (Math.random() * 13 + 1); // Random(1,14)
				if (DealerNumber1 == 14) {
					System.out.print("A");
				} else if (DealerNumber1 == 13) {
					System.out.print("K");
				} else if (DealerNumber1 == 12) {
					System.out.print("Q");
				} else if (DealerNumber1 == 11) {
					System.out.print("J");
				} else {
					System.out.print(DealerNumber1); // Probably a better way to
														// do
														// this but whatever
				}
				// Now for the suit (WHICH DOESN'T MAKE A DAMN DIFFERENCE)
				int ThrowawayNumber1 = (int) (Math.random() * 3 + 1); // Random(1,4)
				if (ThrowawayNumber1 == 4) {
					System.out.print("C"); // Clubs
				} else if (ThrowawayNumber1 == 3) {
					System.out.print("D"); // Diamonds
				} else if (ThrowawayNumber1 == 2) {
					System.out.print("S"); // Spades
				} else { // Must be 1 at this point
					System.out.print("H"); // Hearts
				}
				System.out.print("    XX"); // Mystery card!
				System.out.println(""); // Starts a new line
				// So now we have a card printed, and a suit printed.
				// The code from this point will look horrible, fair warning.
				System.out.println("You have these cards:");
				int UserNumber1 = (int) (Math.random() * 13 + 1); // Random(1,14)
				if (UserNumber1 == 14) {
					System.out.print("A");
				} else if (UserNumber1 == 13) {
					System.out.print("K");
				} else if (UserNumber1 == 12) {
					System.out.print("Q");
				} else if (UserNumber1 == 11) {
					System.out.print("J");
				} else {
					System.out.print(UserNumber1); // Probably a better way to
													// do
													// this but whatever
				}
				// NOW FOR THE SUIT (WHICH DOESN'T MAKE A DAMN DIFFERENCE)
				int ThrowawayNumber2 = (int) (Math.random() * 3 + 1); // Random(1,4)
				if (ThrowawayNumber2 == 4) {
					System.out.print("C"); // Clubs
				} else if (ThrowawayNumber2 == 3) {
					System.out.print("D"); // Diamonds
				} else if (ThrowawayNumber2 == 2) {
					System.out.print("S"); // Spades
				} else { // Must be 1 at this point
					System.out.print("H"); // Hearts
				}
				System.out.print("    ");
				int UserNumber2 = (int) (Math.random() * 13 + 1); // Random(1,14)
				if (UserNumber2 == 14) {
					System.out.print("A");
				} else if (UserNumber2 == 13) {
					System.out.print("K");
				} else if (UserNumber2 == 12) {
					System.out.print("Q");
				} else if (UserNumber2 == 11) {
					System.out.print("J");
				} else {
					System.out.print(UserNumber2); // Probably a better way to
													// do
													// this but whatever
				}
				// NOW FOR THE SUIT (WHICH DOESN'T MAKE A DAMN DIFFERENCE)
				int ThrowawayNumber3 = (int) (Math.random() * 3 + 1); // Random(1,4)
				if (ThrowawayNumber3 == 4) {
					System.out.print("C"); // Clubs
				} else if (ThrowawayNumber3 == 3) {
					System.out.print("D"); // Diamonds
				} else if (ThrowawayNumber3 == 2) {
					System.out.print("S"); // Spades
				} else { // Must be 1 at this point
					System.out.print("H"); // Hearts
				}
				System.out.println("");
				Boolean RoundFinished = false;
				int UserNumber3 = 0; // In case user doesn't hit
				int ThrowawayNumber4 = 0;
				while (!RoundFinished) {
					System.out.print("Hit, Stay, or Double Down? ");
					String Decision = s.nextLine();
					/*
					 * Exception in thread "main" java.util.NoSuchElementException: No line found
					 *	at java.util.Scanner.nextLine(Unknown Source)
					 *	at com.bayviewglen.unitfourassignment.ProjectClass.main(ProjectClass.java:139)
					 *
					 * YES I FIXED THE BUG
					 * Apparently closing Scanners causes things to crash.
					 * I'm serious. s.close(), even when used in METHODS, causes this line to crash,
					 * With the above error being the displayed problem.
					 * Figured it out with help from StackOverflow.
					 */
					if (Decision.equalsIgnoreCase("Hit")) {
						UserNumber3 = (int) (Math.random() * 13 + 1); // Random(1,14)
						System.out.println("You hit: "); // Fills in card later.
						if (UserNumber3 == 14) {
							System.out.print("A");
						} else if (UserNumber3 == 13) {
							System.out.print("K");
						} else if (UserNumber3 == 12) {
							System.out.print("Q");
						} else if (UserNumber3 == 11) {
							System.out.print("J");
						} else {
							System.out.print(UserNumber3); // Probably a better
															// way
															// to do
															// this but whatever
						}
						// NOW FOR THE SUIT (WHICH DOESN'T MAKE A DAMN
						// DIFFERENCE)
						ThrowawayNumber4 = (int) (Math.random() * 3 + 1); // Random(1,4)
						if (ThrowawayNumber4 == 4) {
							System.out.print("C"); // Clubs
						} else if (ThrowawayNumber4 == 3) {
							System.out.print("D"); // Diamonds
						} else if (ThrowawayNumber4 == 2) {
							System.out.print("S"); // Spades
						} else { // Must be 1 at this point
							System.out.print("H"); // Hearts
						}
						RoundFinished = true;
					} else if (Decision.equalsIgnoreCase("Stay")) {
						RoundFinished = true;
					} else if (Decision.equalsIgnoreCase("Double Down")) {
						if (bet + bet > wallet) {
							System.out
									.println("You can't bet money you don't have!");
						} else {
							bet = bet + bet;
							System.out.println("Your bet is now "
									+ moneyFormatter.format(bet));
							RoundFinished = true;
						}
					} else {
						System.out.println("please make a valid choice.");
					}
				} // Time to calculate scores.
				System.out.println("Your cards are: ");
				if (UserNumber1 == 14) {
					System.out.print("A");
				} else if (UserNumber1 == 13) {
					System.out.print("K");
				} else if (UserNumber1 == 12) {
					System.out.print("Q");
				} else if (UserNumber1 == 11) {
					System.out.print("J");
				} else {
					System.out.print(UserNumber1); // Probably a better way to
													// do
													// this but whatever
				}
				// NOW FOR THE SUIT (WHICH DOESN'T MAKE A DAMN DIFFERENCE)
				if (ThrowawayNumber2 == 4) {
					System.out.print("C"); // Clubs
				} else if (ThrowawayNumber2 == 3) {
					System.out.print("D"); // Diamonds
				} else if (ThrowawayNumber2 == 2) {
					System.out.print("S"); // Spades
				} else { // Must be 1 at this point
					System.out.print("H"); // Hearts
				}
				System.out.print("    ");
				if (UserNumber2 == 14) {
					System.out.print("A");
				} else if (UserNumber2 == 13) {
					System.out.print("K");
				} else if (UserNumber2 == 12) {
					System.out.print("Q");
				} else if (UserNumber2 == 11) {
					System.out.print("J");
				} else {
					System.out.print(UserNumber2); // Probably a better way to
													// do
													// this but whatever
				}
				// NOW FOR THE SUIT (WHICH DOESN'T MAKE A DAMN DIFFERENCE)
				if (ThrowawayNumber3 == 4) {
					System.out.print("C"); // Clubs
				} else if (ThrowawayNumber3 == 3) {
					System.out.print("D"); // Diamonds
				} else if (ThrowawayNumber3 == 2) {
					System.out.print("S"); // Spades
				} else { // Must be 1 at this point
					System.out.print("H"); // Hearts
				}

				if (UserNumber3 != 0) { // Essentially if they have a third card
					System.out.print("    ");
					if (UserNumber3 == 14) {
						System.out.print("A");
					} else if (UserNumber3 == 13) {
						System.out.print("K");
					} else if (UserNumber3 == 12) {
						System.out.print("Q");
					} else if (UserNumber3 == 11) {
						System.out.print("J");
					} else {
						System.out.print(UserNumber3); // Probably a better way
														// to
														// do
														// this but whatever
					}
					// NOW FOR THE SUIT (WHICH DOESN'T MAKE A DAMN DIFFERENCE)
					if (ThrowawayNumber4 == 4) {
						System.out.print("C"); // Clubs
					} else if (ThrowawayNumber4 == 3) {
						System.out.print("D"); // Diamonds
					} else if (ThrowawayNumber4 == 2) {
						System.out.print("S"); // Spades
					} else { // Must be 1 at this point
						System.out.print("H"); // Hearts
					}
				}
				int UserScore = 0; // Right now for score
				if (UserNumber1 == 11 || UserNumber1 == 12 || UserNumber1 == 13) {
					UserNumber1 = 10; // Face cards are 10
				}
				if (UserNumber2 == 11 || UserNumber2 == 12 || UserNumber2 == 13) {
					UserNumber2 = 10; // Face cards are 10
				}
				if (UserNumber3 == 11 || UserNumber1 == 12 || UserNumber1 == 13) {
					UserNumber3 = 10; // Face cards are 10
				}
				if (UserNumber1 == 14) {
					UserNumber1 = 11; // Aces are 11, handle that later.
				}
				if (UserNumber2 == 14) {
					UserNumber2 = 11; // Aces are 11, handle that later.
				}
				if (UserNumber3 == 14) {
					UserNumber3 = 11; // Aces are 11, handle that later.
				}
				if (UserNumber1 == 11) { // Aces!
					if (UserNumber1 + UserNumber2 + UserNumber3 < 21)
						UserNumber1 = 11;
					else
						UserNumber1 = 1;
				}
				if (UserNumber2 == 11) { // Aces!
					if (UserNumber1 + UserNumber2 + UserNumber3 < 21)
						UserNumber2 = 11;
					else
						UserNumber2 = 1;
				}
				if (UserNumber3 == 11) { // Aces!
					if (UserNumber1 + UserNumber2 + UserNumber3 < 21)
						UserNumber3 = 11;
					else
						UserNumber3 = 1;
				}
				UserScore = UserNumber1 + UserNumber2 + UserNumber3;
				System.out.println("");
				System.out.println("Your score is: " + UserScore);
				///////////////////////////////////////////////////////////
				System.out.println("The dealer's cards: ");
				if (DealerNumber1 == 14) {
					System.out.print("A");
				} else if (DealerNumber1 == 13) {
					System.out.print("K");
				} else if (DealerNumber1 == 12) {
					System.out.print("Q");
				} else if (DealerNumber1 == 11) {
					System.out.print("J");
				} else {
					System.out.print(DealerNumber1); // Probably a better way to
														// do
														// this but whatever
				}
				// Now for the suit (WHICH DOESN'T MAKE A DAMN DIFFERENCE)
				if (ThrowawayNumber1 == 4) {
					System.out.print("C"); // Clubs
				} else if (ThrowawayNumber1 == 3) {
					System.out.print("D"); // Diamonds
				} else if (ThrowawayNumber1 == 2) {
					System.out.print("S"); // Spades
				} else { // Must be 1 at this point
					System.out.print("H"); // Hearts
				}
				System.out.print("    ");
				int DealerNumber2 = (int) (Math.random() * 13 + 1); // Random(1,14)
				if (DealerNumber2 == 14) {
					System.out.print("A");
				} else if (DealerNumber2 == 13) {
					System.out.print("K");
				} else if (DealerNumber2 == 12) {
					System.out.print("Q");
				} else if (DealerNumber2 == 11) {
					System.out.print("J");
				} else {
					System.out.print(DealerNumber2); // Probably a better way to
														// do
														// this but whatever
				}
				// Now for the suit (WHICH DOESN'T MAKE A DAMN DIFFERENCE)
				int ThrowawayNumber5 = (int) (Math.random() * 3 + 1); // Random(1,4)
				if (ThrowawayNumber5 == 4) {
					System.out.print("C"); // Clubs
				} else if (ThrowawayNumber5 == 3) {
					System.out.print("D"); // Diamonds
				} else if (ThrowawayNumber5 == 2) {
					System.out.print("S"); // Spades
				} else { // Must be 1 at this point
					System.out.print("H"); // Hearts
				}

				int DealerScore = 0;
				if (DealerNumber1 == 11 || DealerNumber1 == 12
						|| DealerNumber1 == 13) {
					DealerNumber1 = 10; // Face cards are 10
				}
				if (DealerNumber2 == 11 || DealerNumber2 == 12
						|| DealerNumber2 == 13) {
					DealerNumber2 = 10; // Face cards are 10
				}
				if (DealerNumber1 == 14) { // Aces!
					DealerNumber1 = 11; // Aces are 1 or 11, handle that later.
				}
				if (DealerNumber2 == 14) { // Aces!
					DealerNumber2 = 11; // Aces are 1 or 11, handle that later.
				}
				DealerScore = DealerNumber1 + DealerNumber2;
				if (DealerScore < 17 && DealerScore < UserScore) {
					int DealerNumber3 = (int) (Math.random() * 13 + 1); // Random(1,14)
					System.out.println("    "); // Fills in card later.
					if (DealerNumber3 == 14) {
						System.out.print("A");
					} else if (DealerNumber3 == 13) {
						System.out.print("K");
					} else if (DealerNumber3 == 12) {
						System.out.print("Q");
					} else if (DealerNumber3 == 11) {
						System.out.print("J");
					} else {
						System.out.print(DealerNumber3); // Probably a better
															// way
															// to do
															// this but whatever
					}
					// NOW FOR THE SUIT (WHICH DOESN'T MAKE A DAMN DIFFERENCE)
					int ThrowawayNumber6 = (int) (Math.random() * 3 + 1); // Random(1,4)
					if (ThrowawayNumber6 == 4) {
						System.out.print("C"); // Clubs
					} else if (ThrowawayNumber6 == 3) {
						System.out.print("D"); // Diamonds
					} else if (ThrowawayNumber6 == 2) {
						System.out.print("S"); // Spades
					} else { // Must be 1 at this point
						System.out.print("H"); // Hearts
					}
					DealerScore = DealerNumber1 + DealerNumber2 + DealerNumber3;
					if (DealerNumber1 == 11 && DealerScore > 21) {
						DealerNumber1 = 1;
						DealerScore = DealerNumber1 + DealerNumber2
								+ DealerNumber3;
					}
					if (DealerNumber2 == 11 && DealerScore > 21) {
						DealerNumber2 = 1;
						DealerScore = DealerNumber1 + DealerNumber2
								+ DealerNumber3;
					}
					if (DealerNumber3 == 11 && DealerScore > 21) {
						DealerNumber3 = 1;
						DealerScore = DealerNumber1 + DealerNumber2
								+ DealerNumber3;
					}
				}
				System.out.println("");
				System.out.println("The dealer's score is: " + DealerScore);

				boolean Winning = false;
				if (UserScore > 21) {
					Winning = false; // instant loss
				} else if (DealerScore > 21) {
					Winning = true; // instant win
				} else if (UserScore > DealerScore) {
					Winning = true; // You win in this case
				} else {
					Winning = false; // You lose in all other cases. Ties go to
										// the
										// house. Sorry.
				}
				if (Winning) {
					wallet = wallet + bet;
					System.out.println("You Win! You now have "
							+ moneyFormatter.format(wallet));
				} else {
					wallet = wallet - bet;
					System.out.println("You Lose! You now have "
							+ moneyFormatter.format(wallet));
				}
				System.out.println("Would you like to play again? Y/N");
				Boolean GoodInput = false;
				String choice = s.nextLine();
				while(!GoodInput)
				if(choice.equalsIgnoreCase("N")) {
				DonePlaying = true;
				GoodInput = true;
				}
				else if(choice.equalsIgnoreCase("Y")) {
				DonePlaying = false;
				GoodInput = true;
				}
				else {
				System.out.println("Please make a valid input.");
				GoodInput = false;
				}
			}
		}
	}

	private static Locale getLocale() {
		Locale locale = null;
		System.out
				.println("Please enter the number corresponding to your Locale:");
		boolean validInput = false;
		while (!validInput) {
			Scanner s = new Scanner(System.in);
			int temp = 0;
			System.out.println("1. United States");
			System.out.println("2. Canada");
			System.out.println("3. French Canada");
			System.out.println("4. Germany");
			System.out.println("5. United Kingdom");
			System.out.println("6. Japan");
			String number = s.nextLine();
			try {
				temp = Integer.parseInt(number);
			} catch (NumberFormatException ex) {
				System.out.println("Not a valid selection.");
				validInput = false;
			}
			if (temp == 1) {
				validInput = true;
				locale = locale.US;
			} else if (temp == 2) {
				validInput = true;
				locale = locale.CANADA;
			} else if (temp == 3) {
				validInput = true;
				locale = locale.CANADA_FRENCH;
			} else if (temp == 4) {
				validInput = true;
				locale = locale.GERMANY;
			} else if (temp == 5) {
				validInput = true;
				locale = locale.UK;
			} else if (temp == 6){
				validInput = true;
				locale = locale.JAPAN;
			}
			else {
				System.out.println("Not a valid selection.");
				validInput = false;
		}
		}
		return locale;
	}

	private static int getBet(int wallet) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int bet = 0;
		boolean validInput = false;
		while (!validInput) {
			System.out.print("You have " + wallet + ". Please enter a bet: ");
			
			String number = s.nextLine();
			try {
				bet = Integer.parseInt(number);
				validInput = true;
			} catch (NumberFormatException ex) {
				System.out.println(bet + " is not a valid bet. Please enter a valid bet.");
				validInput = false;
			}
			
		}
		if (bet > wallet) {
			System.out.println("You can't bet more than you have!");
			validInput = false;
		}
		//s.close(); //CLOSING THIS LITERALLY CAUSES A No
		return bet;
	}
}