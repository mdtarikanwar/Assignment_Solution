const resultInput = document.getElementById('result');
let equation = '';
let equationForDisplay = '0';
resultInput.value = equationForDisplay;

document.querySelectorAll(".btn").forEach(function(btn) {
    btn.addEventListener("click", function() {
        const value = btn.textContent;

        if (value === 'AC') {
            equationForDisplay = '0';
            resultInput.value = equationForDisplay;
            equation = '';
        }
        else if (value === '=') {
            if (equation != '') {
                try {
                    equation = eval(equation);
                    resultInput.value = equation;
                } catch (error) {
                    equation = 'Error';
                    resultInput.value = equation;
                    equation = '';
                    equationForDisplay = '0';
                }
            }         
        }
        else if (value === '×'){
            updateEquation('*', value);
        }
        else if (value === '÷') {
            updateEquation('/', value);
        }
        else if (value === '+') {
            updateEquation('+', value);

        }
        else if (value === '-') {
            updateEquation('-', value);
        }
        else {
            equation += value;
            equationForDisplay = equationForDisplay.replace(/^0+/, "");
            equationForDisplay += value;
            resultInput.value = equationForDisplay;
        }     
        
    })
})

function updateEquation(operator, val) {
    if (equation != '') {
        equation += operator;              
        equationForDisplay += val;
        resultInput.value = equationForDisplay;
    }
}