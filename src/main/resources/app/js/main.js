import openMenu from './modules/active';
import validator from './modules/validator';

window.addEventListener('DOMContentLoaded', () => {
    openMenu('burger', 'sidebar', 'pre', 'blur');
    validator('reg_form','._req', '.form-error');
});