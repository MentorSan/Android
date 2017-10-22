package andorid_dev_2017.calculator_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityV3 extends AppCompatActivity implements View.OnClickListener {

    private String inputOne = "0";
    private String inputTwo = "0";
    private String viewedText = "";
    private boolean isResult = false;


    private enum Operator {
        ADD, SUB, DIV, MUL, NONE
    }

    private Operator lastOperator = Operator.NONE;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_view);
        Button button01 = (Button) findViewById(R.id.button_01);
        button01.setOnClickListener(this);
        Button button02 = (Button) findViewById(R.id.button_02);
        button02.setOnClickListener(this);
        Button button03 = (Button) findViewById(R.id.button_03);
        button03.setOnClickListener(this);
        Button button04 = (Button) findViewById(R.id.button_04);
        button04.setOnClickListener(this);
        Button button05 = (Button) findViewById(R.id.button_05);
        button05.setOnClickListener(this);
        Button button06 = (Button) findViewById(R.id.button_06);
        button06.setOnClickListener(this);
        Button button07 = (Button) findViewById(R.id.button_07);
        button07.setOnClickListener(this);
        Button button08 = (Button) findViewById(R.id.button_08);
        button08.setOnClickListener(this);
        Button button09 = (Button) findViewById(R.id.button_09);
        button09.setOnClickListener(this);
        Button button00 = (Button) findViewById(R.id.button_00);
        button00.setOnClickListener(this);
        Button buttonDiv = (Button) findViewById(R.id.button_div);
        buttonDiv.setOnClickListener(this);
        Button buttonMul = (Button) findViewById(R.id.button_mul);
        buttonMul.setOnClickListener(this);
        Button buttonSub = (Button) findViewById(R.id.button_sub);
        buttonSub.setOnClickListener(this);
        Button buttonAdd = (Button) findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(this);
        Button buttonC = (Button) findViewById(R.id.button_clear);
        buttonC.setOnClickListener(this);
        Button buttonCE = (Button) findViewById(R.id.button_clearEntry);
        buttonCE.setOnClickListener(this);
        Button buttonDot = (Button) findViewById(R.id.button_dot);
        buttonDot.setOnClickListener(this);
        Button buttonResult = (Button) findViewById(R.id.button_result);
        buttonResult.setOnClickListener(this);

    }

    //test comment
    private String checkDoubleForDotZero(String a) {
        if (a.endsWith(".0")) {
            a = a.replace(".0", "");
        }
        return a;
    }

    private String calculate(String a, String b) {
        String result;
        switch (lastOperator) {
            case SUB:
                result = (Double.parseDouble(a) - Double.parseDouble(b)) + "";
                return checkDoubleForDotZero(result);
            case ADD:
                result = (Double.parseDouble(a) + Double.parseDouble(b)) + "";
                return checkDoubleForDotZero(result);
            case DIV:
                if (b.equals("0")) {
                    throw new IllegalArgumentException("Can't divide by zero");
                } else {
                    result = (Double.parseDouble(a) / Double.parseDouble(b)) + "";
                    return checkDoubleForDotZero(result);
                }
            case MUL:
                result = (Double.parseDouble(a) * Double.parseDouble(b)) + "";
                return checkDoubleForDotZero(result);
            default:
                throw new IllegalArgumentException("Trying to apply an invalid operator in calculate");
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_01:
                if (isResult || inputOne.equals("0")) {
                    inputOne = "1";
                    isResult = false;
                    viewedText = "1";
                    break;
                } else if (lastOperator != Operator.NONE) {
                    if (inputTwo.equals("0")) {
                        inputTwo = "1";
                    } else {
                        inputTwo = inputTwo + "1";
                    }
                } else {
                    inputOne = inputOne + "1";
                }
                viewedText = viewedText + "1";
                break;

            case R.id.button_02:
                if (isResult || inputOne.equals("0")) {
                    inputOne = "2";
                    isResult = false;
                    viewedText = "2";
                    break;
                } else if (lastOperator != Operator.NONE) {
                    if (inputTwo.equals("0")) {
                        inputTwo = "2";
                    } else {
                        inputTwo = inputTwo + "2";
                    }
                } else {
                    inputOne = inputOne + "2";
                }
                viewedText = viewedText + "2";
                break;

            case R.id.button_03:
                if (isResult || inputOne.equals("0")) {
                    inputOne = "3";
                    isResult = false;
                    viewedText = "3";
                    break;
                } else if (lastOperator != Operator.NONE) {
                    if (inputTwo.equals("0")) {
                        inputTwo = "3";
                    } else {
                        inputTwo = inputTwo + "3";
                    }
                } else {
                    inputOne = inputOne + "3";
                }
                viewedText = viewedText + "3";
                break;

            case R.id.button_04:
                if (isResult || inputOne.equals("0")) {
                    inputOne = "4";
                    isResult = false;
                    viewedText = "4";
                    break;
                } else if (lastOperator != Operator.NONE) {
                    if (inputTwo.equals("0")) {
                        inputTwo = "4";
                    } else {
                        inputTwo = inputTwo + "4";
                    }
                } else {
                    inputOne = inputOne + "4";
                }
                viewedText = viewedText + "4";
                break;

            case R.id.button_05:
                if (isResult || inputOne.equals("0")) {
                    inputOne = "5";
                    isResult = false;
                    viewedText = "5";
                    break;
                } else if (lastOperator != Operator.NONE) {
                    if (inputTwo.equals("0")) {
                        inputTwo = "5";
                    } else {
                        inputTwo = inputTwo + "5";
                    }
                } else {
                    inputOne = inputOne + "5";
                }
                viewedText = viewedText + "5";
                break;

            case R.id.button_06:
                if (isResult || inputOne.equals("0")) {
                    inputOne = "6";
                    isResult = false;
                    viewedText = "6";
                    break;
                } else if (lastOperator != Operator.NONE) {
                    if (inputTwo.equals("0")) {
                        inputTwo = "6";
                    } else {
                        inputTwo = inputTwo + "6";
                    }
                } else {
                    inputOne = inputOne + "6";
                }
                viewedText = viewedText + "6";
                break;

            case R.id.button_07:
                if (isResult || inputOne.equals("0")) {
                    inputOne = "7";
                    isResult = false;
                    viewedText = "7";
                    break;
                } else if (lastOperator != Operator.NONE) {
                    if (inputTwo.equals("0")) {
                        inputTwo = "7";
                    } else {
                        inputTwo = inputTwo + "7";
                    }
                } else {
                    inputOne = inputOne + "7";
                }
                viewedText = viewedText + "7";
                break;

            case R.id.button_08:
                if (isResult || inputOne.equals("0")) {
                    inputOne = "8";
                    isResult = false;
                    viewedText = "8";
                    break;
                } else if (lastOperator != Operator.NONE) {
                    if (inputTwo.equals("0")) {
                        inputTwo = "8";
                    } else {
                        inputTwo = inputTwo + "8";
                    }
                } else {
                    inputOne = inputOne + "8";
                }
                viewedText = viewedText + "8";
                break;

            case R.id.button_09:
                if (isResult || inputOne.equals("0")) {
                    inputOne = "9";
                    isResult = false;
                    viewedText = "9";
                    break;
                } else if (lastOperator != Operator.NONE) {
                    if (inputTwo.equals("0")) {
                        inputTwo = "9";
                    } else {
                        inputTwo = inputTwo + "9";
                    }
                } else {
                    inputOne = inputOne + "9";
                }
                viewedText = viewedText + "9";
                break;

            case R.id.button_00:
                if (isResult || inputOne.equals("0")) {
                    inputOne = "0";
                    isResult = false;
                    viewedText = "0";
                    break;
                } else if (lastOperator != Operator.NONE) {
                    if (inputTwo.equals("0")) {
                        inputTwo = "0";
                    } else {
                        inputTwo = inputTwo + "0";
                    }
                } else {
                    inputOne = inputOne + "0";
                }
                viewedText = viewedText + "0";
                break;

            case R.id.button_dot:
                if (!inputTwo.equals("0")) {
                    if (inputTwo.endsWith(".") || inputTwo.contains(".")) {
                        inputTwo = inputTwo + "";
                        viewedText = viewedText + "";
                    } else {
                        inputTwo = inputTwo + ".";
                        viewedText = viewedText + ".";
                    }
                } else {
                    if (inputOne.endsWith(".") || inputOne.contains(".")) {
                        inputOne = inputOne + "";
                        viewedText = viewedText + "";
                    } else {
                        inputOne = inputOne + ".";
                        viewedText = viewedText + ".";
                    }
                }
                break;

            case R.id.button_sub:
                if (isResult) {
                    isResult = false;
                }

                lastOperator = Operator.SUB;
                if (viewedText.contains("-")) {
                    viewedText = viewedText + "";
                }else {
                    viewedText = viewedText + "-";
                }
                break;

            case R.id.button_add:
                if (isResult) {
                    isResult = false;
                }
                lastOperator = Operator.ADD;
                if (viewedText.contains("+")) {
                    viewedText = viewedText + "";
                }else {
                    viewedText = viewedText + "+";
                }
                break;

            case R.id.button_div:
                if (isResult) {
                    isResult = false;
                }
                lastOperator = Operator.DIV;
                if (viewedText.contains("/")) {
                    viewedText = viewedText + "";
                }else {
                    viewedText = viewedText + "/";
                }
                break;

            case R.id.button_mul:
                if (isResult) {
                    isResult = false;
                }
                lastOperator = Operator.MUL;
                if (viewedText.contains("*")) {
                    viewedText = viewedText + "";
                }else {
                    viewedText = viewedText + "*";
                }
                break;

            case R.id.button_clear:
                inputOne = "0";
                inputTwo = "0";
                viewedText = "0";
                lastOperator = Operator.NONE;
                isResult = true;
                break;

            case R.id.button_clearEntry:
                if (inputTwo.equals("0")) {
                    inputOne = "0";
                    inputTwo = "0";
                    viewedText = "0";
                    lastOperator = Operator.NONE;
                    isResult = true;
                } else {
                    switch (lastOperator) {
                        case ADD:
                            inputTwo = "0";
                            viewedText = inputOne + "+";
                            break;
                        case SUB:
                            inputTwo = "0";
                            viewedText = inputOne + "-";
                            break;
                        case MUL:
                            inputTwo = "0";
                            viewedText = inputOne + "*";
                            break;
                        case DIV:
                            inputTwo = "0";
                            viewedText = inputOne + "/";
                            break;
                    }
                }
                break;


            case R.id.button_result:
                if (lastOperator == Operator.NONE) {
                    viewedText = viewedText + "";
                } else {
                    inputOne = calculate(inputOne, inputTwo);
                    inputTwo = "0";
                    viewedText = inputOne;
                }
                isResult = true;
                lastOperator = Operator.NONE;
                break;
        }

        if (viewedText.length() > 13) {
            viewedText = viewedText.substring(0, 13);
        }
        textView.setText(viewedText);


    }

}
