
const openMenu = (button, menu, pre, blur) => {

    const btn = document.getElementById(button),
          sidebar = document.getElementById(menu),
          allSide = document.getElementById(pre),
          addBlur = document.getElementById(blur);

    const body = document.querySelector('body');
    const scroll = calcScroll();

    let isOpen = false;

    btn.addEventListener('click', ()=>{

        if(!isOpen) {
            btn.classList.add('active');
            sidebar.classList.add('active');
            allSide.classList.add('open');
            addBlur.classList.add('blured');

            body.style.overflow = 'hidden';
            body.style.marginRight = `${scroll}px`;

            isOpen = true;
        } else {
            btn.classList.remove('active');
            sidebar.classList.remove('active');
            allSide.classList.remove('open');
            addBlur.classList.remove('blured');

            body.style.overflow = 'auto';
            body.style.marginRight = `0px`;

            isOpen = false;
        }
    })
}


function calcScroll() {
        
    let div = document.createElement('div');

    div.style.width = '50px';
    div.style.height = '50px';
    div.style.overflowY = 'scroll';
    div.style.visibility = 'hidden';

    document.body.appendChild(div);

    let scrollWidth = div.offsetWidth - div.clientWidth;
    div.remove();

    return scrollWidth;
}


export default openMenu;