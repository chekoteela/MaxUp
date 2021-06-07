const validatorLogin = (contactForm, formReq, errorText) => {

    const form = document.getElementById(contactForm),
          reqs = document.querySelectorAll(formReq),
          text = document.querySelectorAll(errorText);

    if(form !== null) {
        form.addEventListener('submit', formSend);

        async function formSend(e) {
            e.preventDefault();
    
            let errorCount = checkForm(reqs, text);
    
            let data = new FormData(form);

            if(errorCount === 0) {

                let object = {
                    balance: '0',
                }

                data.forEach((value, key) => {
                    object[key] = value;
                });

                let json = JSON.stringify(object);

                const xhr = new XMLHttpRequest();
                const path = '/login';
                const headers = {
                    'Content-Type': 'application/json',
                    'Accept': 'application/json'
                };

                const request = fetch(path, {
                    method: "POST",
                    body: json,
                    headers: headers,
                })
                    .then((response) => response.json())
                    .then((object) => {
                        return object.response;
                    })
                    .catch(error => console.log('error:', error));

                if(request === 'OK') {
                    window.location.href = '/';
                } else if (request === "Email or password are invalid") {
                    alert('Почта или пароль неправильный');
                } else {
                    alert('Ошибка');
                }
            }
        }
    }
}


const loginTest = (input) => {
    return !(/^[a-z,A-Z,0-9,_]+$/.test(input.value) || /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,8})+$/.test(input.value));
}

const passwordTest = (input) => {
    return !/^[a-z,A-Z,0-9]+$/.test(input.value);
}

function checkForm(formReqs, text) {

    let error = 0;

    for(let index=0; index<formReqs.length; index++) {

        const input = formReqs[index];
        const inputText = text[index];
        removeError(input);

        inputText.style.display = 'none';

        if ( input.value === '') {
            addError(input);
            inputText.style.display = 'block';
            error++;

        } else if(input.classList.contains('_login')) {

            if (loginTest(input)) {
                addError(input);
                inputText.textContent = 'Неправильный ввод';
                inputText.style.display = 'block';
                error++;
            }
        } else if(input.classList.contains('_password')) {

            if(passwordTest(input) || input.value.length < 4) {
                addError(input);
                inputText.textContent = 'Неправильный ввод';
                inputText.style.display = 'block';
                error++;
            }

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


export default validatorLogin;