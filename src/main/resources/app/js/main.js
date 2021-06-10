import openMenu from './modules/active';
import validator from './modules/validator';
import validatorLogin from './modules/login';
import linkClick from './modules/links';
import front from './modules/front';

window.addEventListener('DOMContentLoaded', () => {
    openMenu('burger', 'sidebar', 'pre', 'blur');
    validator('reg_form','._req', '.form-error');
    validatorLogin('login__form', '._req', '.form-error');
    linkClick('.register');
    linkClick('.login');
    // front();
});