package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Controller {
	private static char[][] characterBoxes = new char[6][5];
	private WordList list = WordList.getInstance();
	private String randomWord = list.randomWord();
	private boolean win = false;

	private static boolean canSubmit = false;
	private static int col = 0;
	private static int row = 0;

	@FXML
	private TextField textField00;
	@FXML
	private TextField textField01;
	@FXML
	private TextField textField02;
	@FXML
	private TextField textField03;
	@FXML
	private TextField textField04;
	@FXML
	private TextField textField10;
	@FXML
	private TextField textField11;
	@FXML
	private TextField textField12;
	@FXML
	private TextField textField13;
	@FXML
	private TextField textField14;
	@FXML
	private TextField textField20;
	@FXML
	private TextField textField21;
	@FXML
	private TextField textField22;
	@FXML
	private TextField textField23;
	@FXML
	private TextField textField24;
	@FXML
	private TextField textField30;
	@FXML
	private TextField textField31;
	@FXML
	private TextField textField32;
	@FXML
	private TextField textField33;
	@FXML
	private TextField textField34;
	@FXML
	private TextField textField40;
	@FXML
	private TextField textField41;
	@FXML
	private TextField textField42;
	@FXML
	private TextField textField43;
	@FXML
	private TextField textField44;
	@FXML
	private TextField textField50;
	@FXML
	private TextField textField51;
	@FXML
	private TextField textField52;
	@FXML
	private TextField textField53;
	@FXML
	private TextField textField54;

	@FXML
	private Button aButton;
	@FXML
	private Button bButton;
	@FXML
	private Button cButton;
	@FXML
	private Button dButton;
	@FXML
	private Button eButton;
	@FXML
	private Button fButton;
	@FXML
	private Button gButton;
	@FXML
	private Button hButton;
	@FXML
	private Button iButton;
	@FXML
	private Button jButton;
	@FXML
	private Button kButton;
	@FXML
	private Button lButton;
	@FXML
	private Button mButton;
	@FXML
	private Button nButton;
	@FXML
	private Button oButton;
	@FXML
	private Button pButton;
	@FXML
	private Button qButton;
	@FXML
	private Button rButton;
	@FXML
	private Button sButton;
	@FXML
	private Button tButton;
	@FXML
	private Button uButton;
	@FXML
	private Button vButton;
	@FXML
	private Button wButton;
	@FXML
	private Button xButton;
	@FXML
	private Button yButton;
	@FXML
	private Button zButton;

	@FXML
	private Button newGame;

	public void newGameButton() {
		characterBoxes = new char[6][5];
		randomWord = list.randomWord();
		win = false;
		canSubmit = false;
		col = 0;
		row = 0;
		String boxColor = "-fx-background-color: black;-fx-text-fill: white; ";

		textField00.setText("");
		textField00.setStyle(boxColor);
		textField01.setText("");
		textField01.setStyle(boxColor);
		textField02.setText("");
		textField02.setStyle(boxColor);
		textField03.setText("");
		textField03.setStyle(boxColor);
		textField04.setText("");
		textField04.setStyle(boxColor);
		textField10.setText("");
		textField10.setStyle(boxColor);
		textField11.setText("");
		textField11.setStyle(boxColor);
		textField12.setText("");
		textField12.setStyle(boxColor);
		textField13.setText("");
		textField13.setStyle(boxColor);
		textField14.setText("");
		textField14.setStyle(boxColor);
		textField20.setText("");
		textField20.setStyle(boxColor);
		textField21.setText("");
		textField21.setStyle(boxColor);
		textField22.setText("");
		textField22.setStyle(boxColor);
		textField23.setText("");
		textField23.setStyle(boxColor);
		textField24.setText("");
		textField24.setStyle(boxColor);
		textField30.setText("");
		textField30.setStyle(boxColor);
		textField31.setText("");
		textField31.setStyle(boxColor);
		textField32.setText("");
		textField32.setStyle(boxColor);
		textField33.setText("");
		textField33.setStyle(boxColor);
		textField34.setText("");
		textField34.setStyle(boxColor);
		textField40.setText("");
		textField40.setStyle(boxColor);
		textField41.setText("");
		textField41.setStyle(boxColor);
		textField42.setText("");
		textField42.setStyle(boxColor);
		textField43.setText("");
		textField43.setStyle(boxColor);
		textField44.setText("");
		textField44.setStyle(boxColor);
		textField50.setText("");
		textField50.setStyle(boxColor);
		textField51.setText("");
		textField51.setStyle(boxColor);
		textField52.setText("");
		textField52.setStyle(boxColor);
		textField53.setText("");
		textField53.setStyle(boxColor);
		textField54.setText("");
		textField54.setStyle(boxColor);

		aButton.setDisable(false);
		bButton.setDisable(false);
		cButton.setDisable(false);
		dButton.setDisable(false);
		eButton.setDisable(false);
		fButton.setDisable(false);
		gButton.setDisable(false);
		hButton.setDisable(false);
		iButton.setDisable(false);
		jButton.setDisable(false);
		kButton.setDisable(false);
		lButton.setDisable(false);
		mButton.setDisable(false);
		nButton.setDisable(false);
		oButton.setDisable(false);
		pButton.setDisable(false);
		qButton.setDisable(false);
		rButton.setDisable(false);
		sButton.setDisable(false);
		tButton.setDisable(false);
		uButton.setDisable(false);
		vButton.setDisable(false);
		wButton.setDisable(false);
		xButton.setDisable(false);
		yButton.setDisable(false);
		zButton.setDisable(false);

	}

	public boolean checkAnswer() {
		System.out.println(randomWord);
		String answer = new String();

		for (int i = 0; i < 5; i++) {
			answer = answer.concat(String.valueOf(characterBoxes[row][i]));
		}
		answer = answer.toLowerCase();

		for (int i = 0; i < answer.length(); i++) {
			if (randomWord.charAt(i) == answer.charAt(i)) {
				changeColor(row, i, "forestgreen");
			} else if (randomWord.contains(answer.subSequence(i, i + 1))) {
				changeColor(row, i, "yellow");
			} else {
				disableButton(String.valueOf(answer.charAt(i)));
			}

		}

		if (answer.equalsIgnoreCase(randomWord)) {
			return true;
		} else {
			return false;
		}
	}

	public void win() {
		canSubmit = false;
		win = true;
		System.out.println("Winner");
	}

	public void disableButton(String letter) {
		if (letter.equalsIgnoreCase("a")) {
			aButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("b")) {
			bButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("c")) {
			cButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("d")) {
			dButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("e")) {
			eButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("f")) {
			fButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("g")) {
			gButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("h")) {
			hButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("i")) {
			iButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("j")) {
			jButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("k")) {
			kButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("l")) {
			lButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("m")) {
			mButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("n")) {
			nButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("o")) {
			oButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("p")) {
			pButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("q")) {
			qButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("r")) {
			rButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("s")) {
			sButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("t")) {
			tButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("u")) {
			uButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("v")) {
			vButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("w")) {
			wButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("x")) {
			xButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("y")) {
			yButton.setDisable(true);
		} else if (letter.equalsIgnoreCase("z")) {
			zButton.setDisable(true);
		}
	}

	public void changeColor(int row, int col, String color) {
		String boxColor = "-fx-background-color: " + color + ";-fx-text-fill: black; ";
		if (row == 0) {
			if (col == 0) {
				textField00.setStyle(boxColor);
			} else if (col == 1) {
				textField01.setStyle(boxColor);
			} else if (col == 2) {
				textField02.setStyle(boxColor);
			} else if (col == 3) {
				textField03.setStyle(boxColor);
			} else if (col == 4) {
				textField04.setStyle(boxColor);
			}
		} else if (row == 1) {
			if (col == 0) {
				textField10.setStyle(boxColor);
			} else if (col == 1) {
				textField11.setStyle(boxColor);
			} else if (col == 2) {
				textField12.setStyle(boxColor);
			} else if (col == 3) {
				textField13.setStyle(boxColor);
			} else if (col == 4) {
				textField14.setStyle(boxColor);
			}
		} else if (row == 2) {
			if (col == 0) {
				textField20.setStyle(boxColor);
			} else if (col == 1) {
				textField21.setStyle(boxColor);
			} else if (col == 2) {
				textField22.setStyle(boxColor);
			} else if (col == 3) {
				textField23.setStyle(boxColor);
			} else if (col == 4) {
				textField24.setStyle(boxColor);
			}
		} else if (row == 3) {
			if (col == 0) {
				textField30.setStyle(boxColor);
			} else if (col == 1) {
				textField31.setStyle(boxColor);
			} else if (col == 2) {
				textField32.setStyle(boxColor);
			} else if (col == 3) {
				textField33.setStyle(boxColor);
			} else if (col == 4) {
				textField34.setStyle(boxColor);
			}
		} else if (row == 4) {
			if (col == 0) {
				textField40.setStyle(boxColor);
			} else if (col == 1) {
				textField41.setStyle(boxColor);
			} else if (col == 2) {
				textField42.setStyle(boxColor);
			} else if (col == 3) {
				textField43.setStyle(boxColor);
			} else if (col == 4) {
				textField44.setStyle(boxColor);
			}
		} else if (row == 5) {
			if (col == 0) {
				textField50.setStyle(boxColor);
			} else if (col == 1) {
				textField51.setStyle(boxColor);
			} else if (col == 2) {
				textField52.setStyle(boxColor);
			} else if (col == 3) {
				textField53.setStyle(boxColor);
			} else if (col == 4) {
				textField54.setStyle(boxColor);
			}
		}
	}

	public void submit() {
		if (row == 5 && col == 4) {
			return;
		} else {
			if (canSubmit == true) {
				row++;
				col = 0;
				canSubmit = false;
			}

		}

	}

	public void delete() {
		characterBoxes[row][col] = '\u0000';
		if (win == false) {
			if (row == 0) {
				if (col == 0) {
					if (!textField00.getText().equals("")) {
						textField00.setText("");
					}
					System.out.println(row + " " + col);
				} else if (col == 1) {
					if (!textField00.getText().equals("")) {
						col--;
						textField00.setText("");
					}
					System.out.println(row + " " + col);
				} else if (col == 2) {
					if (!textField01.getText().equals("")) {
						col--;
						textField01.setText("");
					}
					System.out.println(row + " " + col);
				} else if (col == 3) {
					if (!textField02.getText().equals("")) {
						col--;
						textField02.setText("");
					}
					System.out.println(row + " " + col);
				} else if (col == 4) {
					if (!textField04.getText().equals("")) {
						textField04.setText("");
					} else {
						col--;
						textField03.setText(" ");
					}
					canSubmit = false;
					System.out.println(row + " " + col);
				}
			} else if (row == 1) {
				if (col == 0) {
					if (!textField10.getText().equals("")) {
						textField10.setText("");
					}
				} else if (col == 1) {
					if (!textField10.getText().equals("")) {
						col--;
						textField10.setText("");
					}
				} else if (col == 2) {
					if (!textField11.getText().equals("")) {
						col--;
						textField11.setText("");
					}
				} else if (col == 3) {
					if (!textField12.getText().equals("")) {
						col--;
						textField12.setText("");
					}
				} else if (col == 4) {
					if (!textField14.getText().equals("")) {
						textField14.setText("");
					} else {
						col--;
						textField13.setText(" ");
					}
					canSubmit = false;
				}
			} else if (row == 2) {
				if (col == 0) {
					if (!textField20.getText().equals("")) {
						textField20.setText("");
					}
				} else if (col == 1) {
					if (!textField20.getText().equals("")) {
						col--;
						textField20.setText("");
					}
				} else if (col == 2) {
					if (!textField21.getText().equals("")) {
						col--;
						textField21.setText("");
					}
				} else if (col == 3) {
					if (!textField22.getText().equals("")) {
						col--;
						textField22.setText("");
					}
				} else if (col == 4) {
					if (!textField24.getText().equals("")) {
						textField24.setText("");
					} else {
						col--;
						textField23.setText(" ");
					}
					canSubmit = false;
				}
			} else if (row == 3) {
				if (col == 0) {
					if (!textField30.getText().equals("")) {
						textField30.setText("");
					}
				} else if (col == 1) {
					if (!textField30.getText().equals("")) {
						col--;
						textField30.setText("");
					}
				} else if (col == 2) {
					if (!textField31.getText().equals("")) {
						col--;
						textField31.setText("");
					}
				} else if (col == 3) {
					if (!textField32.getText().equals("")) {
						col--;
						textField32.setText("");
					}
				} else if (col == 4) {
					if (!textField34.getText().equals("")) {
						textField34.setText("");
					} else {
						col--;
						textField33.setText(" ");
					}
					canSubmit = false;
				}
			} else if (row == 4) {
				if (col == 0) {
					if (!textField40.getText().equals("")) {
						textField40.setText("");
					}
				} else if (col == 1) {
					if (!textField40.getText().equals("")) {
						col--;
						textField40.setText("");
					}
				} else if (col == 2) {
					if (!textField41.getText().equals("")) {
						col--;
						textField41.setText("");
					}
				} else if (col == 3) {
					if (!textField42.getText().equals("")) {
						col--;
						textField42.setText("");
					}
				} else if (col == 4) {
					if (!textField44.getText().equals("")) {
						textField44.setText("");
					} else {
						col--;
						textField43.setText(" ");
					}
					canSubmit = false;
				}
			} else if (row == 5) {
				if (col == 0) {
					if (!textField50.getText().equals("")) {
						textField50.setText("");
					}
				} else if (col == 1) {
					if (!textField50.getText().equals("")) {
						col--;
						textField50.setText("");
					}
				} else if (col == 2) {
					if (!textField51.getText().equals("")) {
						col--;
						textField51.setText("");
					}
				} else if (col == 3) {
					if (!textField52.getText().equals("")) {
						col--;
						textField52.setText("");
					}
				} else if (col == 4) {
					if (!textField54.getText().equals("")) {
						textField54.setText("");
					} else {
						col--;
						textField53.setText(" ");
					}
					canSubmit = false;
				}
			}
		}

	}

	public void setText(char letter) {
		characterBoxes[row][col] = letter;
		int fontSize = 28;
		if (win == false) {
			if (row == 0) {
				if (col == 0 && !canSubmit) {
					if (textField00.getText().equals("")) {
						textField00.setText(String.valueOf(letter));
						textField00.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField00.setText(String.valueOf(letter));
						textField00.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 1 && !canSubmit) {
					if (textField01.getText().equals("")) {
						textField01.setText(String.valueOf(letter));
						textField01.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField01.setText(String.valueOf(letter));
						textField01.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 2 && !canSubmit) {
					if (textField02.getText().equals("")) {
						textField02.setText(String.valueOf(letter));
						textField02.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField02.setText(String.valueOf(letter));
						textField02.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 3 && !canSubmit) {
					if (textField03.getText().equals("")) {
						textField03.setText(String.valueOf(letter));
						textField03.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField03.setText(String.valueOf(letter));
						textField03.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 4) {
					if (textField04.getText().equals("")) {
						textField04.setText(String.valueOf(letter));
						textField04.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
					canSubmit = true;
				}
			} else if (row == 1) {
				if (col == 0 && !canSubmit) {
					if (textField10.getText().equals("")) {
						textField10.setText(String.valueOf(letter));
						textField10.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField10.setText(String.valueOf(letter));
						textField10.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 1 && !canSubmit) {
					if (textField11.getText().equals("")) {
						textField11.setText(String.valueOf(letter));
						textField11.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField11.setText(String.valueOf(letter));
						textField11.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 2 && !canSubmit) {
					if (textField12.getText().equals("")) {
						textField12.setText(String.valueOf(letter));
						textField12.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField12.setText(String.valueOf(letter));
						textField12.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 3 && !canSubmit) {
					if (textField13.getText().equals("")) {
						textField13.setText(String.valueOf(letter));
						textField13.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField13.setText(String.valueOf(letter));
						textField13.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 4) {
					if (textField14.getText().equals("")) {
						textField14.setText(String.valueOf(letter));
						textField14.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
					canSubmit = true;
				}
			}
			// Replace here
			else if (row == 2) {
				if (col == 0 && !canSubmit) {
					if (textField20.getText().equals("")) {
						textField20.setText(String.valueOf(letter));
						textField20.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField20.setText(String.valueOf(letter));
						textField20.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 1 && !canSubmit) {
					if (textField21.getText().equals("")) {
						textField21.setText(String.valueOf(letter));
						textField21.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField21.setText(String.valueOf(letter));
						textField21.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 2 && !canSubmit) {
					if (textField22.getText().equals("")) {
						textField22.setText(String.valueOf(letter));
						textField22.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField22.setText(String.valueOf(letter));
						textField22.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 3 && !canSubmit) {
					if (textField23.getText().equals("")) {
						textField23.setText(String.valueOf(letter));
						textField23.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField23.setText(String.valueOf(letter));
						textField23.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 4) {
					if (textField24.getText().equals("")) {
						textField24.setText(String.valueOf(letter));
						textField24.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
					canSubmit = true;
				}
			} else if (row == 3) {
				if (col == 0 && !canSubmit) {
					if (textField30.getText().equals("")) {
						textField30.setText(String.valueOf(letter));
						textField30.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField30.setText(String.valueOf(letter));
						textField30.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 1 && !canSubmit) {
					if (textField31.getText().equals("")) {
						textField31.setText(String.valueOf(letter));
						textField31.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField31.setText(String.valueOf(letter));
						textField31.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 2 && !canSubmit) {
					if (textField32.getText().equals("")) {
						textField32.setText(String.valueOf(letter));
						textField32.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField32.setText(String.valueOf(letter));
						textField32.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 3 && !canSubmit) {
					if (textField33.getText().equals("")) {
						textField33.setText(String.valueOf(letter));
						textField33.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField33.setText(String.valueOf(letter));
						textField33.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 4) {
					if (textField34.getText().equals("")) {
						textField34.setText(String.valueOf(letter));
						textField34.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
					canSubmit = true;
				}
			} else if (row == 4) {
				if (col == 0 && !canSubmit) {
					if (textField40.getText().equals("")) {
						textField40.setText(String.valueOf(letter));
						textField40.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField40.setText(String.valueOf(letter));
						textField40.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 1 && !canSubmit) {
					if (textField41.getText().equals("")) {
						textField41.setText(String.valueOf(letter));
						textField41.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField41.setText(String.valueOf(letter));
						textField41.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 2 && !canSubmit) {
					if (textField42.getText().equals("")) {
						textField42.setText(String.valueOf(letter));
						textField42.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField42.setText(String.valueOf(letter));
						textField42.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 3 && !canSubmit) {
					if (textField43.getText().equals("")) {
						textField43.setText(String.valueOf(letter));
						textField43.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField43.setText(String.valueOf(letter));
						textField43.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 4) {
					if (textField44.getText().equals("")) {
						textField44.setText(String.valueOf(letter));
						textField44.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
					canSubmit = true;
				}
			} else if (row == 5) {
				if (col == 0 && !canSubmit) {
					if (textField50.getText().equals("")) {
						textField50.setText(String.valueOf(letter));
						textField50.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField50.setText(String.valueOf(letter));
						textField50.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 1 && !canSubmit) {
					if (textField51.getText().equals("")) {
						textField51.setText(String.valueOf(letter));
						textField51.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField51.setText(String.valueOf(letter));
						textField51.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 2 && !canSubmit) {
					if (textField52.getText().equals("")) {
						textField52.setText(String.valueOf(letter));
						textField52.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField52.setText(String.valueOf(letter));
						textField52.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 3 && !canSubmit) {
					if (textField53.getText().equals("")) {
						textField53.setText(String.valueOf(letter));
						textField53.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
						col++;
					} else {
						col++;
						textField53.setText(String.valueOf(letter));
						textField53.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
				} else if (col == 4) {
					if (textField54.getText().equals("")) {
						textField54.setText(String.valueOf(letter));
						textField54.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, fontSize));
					}
					canSubmit = true;
				}
			}
		}

	}

	public void qButton(ActionEvent event) {
		setText('Q');
	}

	public void wButton(ActionEvent event) {
		setText('W');
	}

	public void eButton(ActionEvent event) {
		setText('E');

	}

	public void rButton(ActionEvent event) {
		setText('R');

	}

	public void tButton(ActionEvent event) {
		setText('T');
	}

	public void yButton(ActionEvent event) {
		setText('Y');
	}

	public void uButton(ActionEvent event) {
		setText('U');

	}

	public void iButton(ActionEvent event) {
		setText('I');

	}

	public void oButton(ActionEvent event) {
		setText('O');

	}

	public void pButton(ActionEvent event) {
		setText('P');

	}

	public void aButton(ActionEvent event) {
		setText('A');

	}

	public void sButton(ActionEvent event) {
		setText('S');

	}

	public void dButton(ActionEvent event) {
		setText('D');

	}

	public void fButton(ActionEvent event) {
		setText('F');

	}

	public void gButton(ActionEvent event) {
		setText('G');

	}

	public void hButton(ActionEvent event) {
		setText('H');

	}

	public void jButton(ActionEvent event) {
		setText('J');

	}

	public void kButton(ActionEvent event) {
		setText('K');

	}

	public void lButton(ActionEvent event) {
		setText('L');

	}

	public void zButton(ActionEvent event) {
		setText('Z');

	}

	public void xButton(ActionEvent event) {
		setText('X');

	}

	public void cButton(ActionEvent event) {
		setText('C');

	}

	public void vButton(ActionEvent event) {
		setText('V');

	}

	public void bButton(ActionEvent event) {
		setText('B');

	}

	public void nButton(ActionEvent event) {
		setText('N');

	}

	public void mButton(ActionEvent event) {
		setText('M');

	}

	public void enterButton(ActionEvent event) {
		if (canSubmit) {
			if (checkAnswer() && win == false) {
				win();
			} else if (!checkAnswer() && win == false) {
				if (row == 5 && col == 4) {
					return;
				} else {
					row++;
					col = 0;
					canSubmit = false;
				}

			}

		} else {
			return;
		}

	}

	public void deleteButton(ActionEvent event) {
		delete();
	}

}
