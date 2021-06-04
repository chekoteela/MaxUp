const validator = (contactForm, formReq) => {

    const form = document.getElementById(contactForm),
          reqs = document.querySelectorAll(formReq);

    form.addEventListener('submit', formSend);

    async function formSend(e) {
        e.preventDefault();

        let errorCount = checkForm(reqs);

        console.log(errorCount);
    }

};

const loginTest = (input) => {
    return !/^[аАбБвВгГдДеЕёЁжЖзЗиИйЙкКлЛмМнНоОпПрРсСтТуУфФхХцЦчЧшШщЩъЪыЫьЬэЭюЮяЯєЄїЇіІ]+$/.test(input.value);
}

function checkForm(formReqs) {

    let error = 0;
    const checkbox = document.querySelector('.form-checkstyle');

    for(let index=0; index<formReqs.length; index++) {

        const input = formReqs[index];
        removeError(input);
        checkbox.classList.remove('_error');

        if(input.classList.contains('_login')) {
            if (loginTest(input)) {
                addError(input);
                error++;
            }
        } else {
            if( input.value === '') {
                addError(input);
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

export  default validator;