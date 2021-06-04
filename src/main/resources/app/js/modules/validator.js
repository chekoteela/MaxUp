const validator = (contactForm, formReq, errorText) => {

    const form = document.getElementById(contactForm),
          reqs = document.querySelectorAll(formReq),
          text = document.querySelectorAll(errorText);

    form.addEventListener('submit', formSend);

    async function formSend(e) {
        e.preventDefault();

        let errorCount = checkForm(reqs, text);

        console.log(errorCount);
    }

};

const loginTest = (input) => {
    return !/^[a-z,A-Z,0-9,_]+$/.test(input.value);
}

const emailTest = (input) => {
    return !/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,8})+$/.test(input.value);
}

const passwordTest = (input) => {
    return !/^[a-z,A-Z,0-9]+$/.test(input.value);
}

function checkForm(formReqs, text) {

    let error = 0;
    const checkbox = document.querySelector('.form-checkstyle');

    for(let index=0; index<formReqs.length; index++) {

        const input = formReqs[index];
        const inputText = text[index];
        removeError(input);
        checkbox.classList.remove('_error');

        inputText.style.display = 'none';

        if ( input.value === '') {
            addError(input);
            inputText.style.display = 'block';
            error++;

        } else if(input.classList.contains('_login')) {

            if (loginTest(input)) {
                addError(input);
                inputText.textContent = 'Логин может содержать только латинские буквы, цифры и символ _';
                inputText.style.display = 'block';
                error++;
            }
        } else if(input.classList.contains('_email')) {
            
            if(emailTest(input)) {
                addError(input);
                inputText.textContent = 'Указана неправильная почта';
                inputText.style.display = 'block';
                error++;
            }
        } else if(input.classList.contains('_password')) {

            if(passwordTest(input)) {
                addError(input);
                inputText.textContent = 'Пароль может содержать только латинские буквы и цифры';
                inputText.style.display = 'block';
                error++;
            }
            if(input.value.length < 4) {
                addError(input);
                inputText.textContent = 'Пароль должен быть не менее 4 символов';
                inputText.style.display = 'block';
                error++;
            }
        } else if(input.getAttribute("type") === "checkbox" && input.checked === false) {
            
            addError(input);
            checkbox.classList.add('_error');
            error++;
        }

    }

    return error;
}

function addError(input) {
    input.classList.add('_error');
}

function removeError(input) {
    input.classList.remove('_error');
}

export  default validator;