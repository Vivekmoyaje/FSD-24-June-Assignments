

        let counter = 0;

        let counterelement = document.getElementById("counter");
        let increment = document.getElementById("increament");
        let decreament = document.getElementById("decreament");
        let reset = document.getElementById("reset");

        increment.addEventListener("click",()=>{
            counter++;
            counterelement.textContent = counter;
            if(counter > 0){
                counterelement.style.color = 'green';
            }else if(counter == 0){
                counterelement.style.color = 'black';
            }
        });

        decreament.addEventListener("click",()=>{
            counter--;
            counterelement.textContent = counter;
            if(counter < 0){
                counterelement.style.color = 'red';
            }else if(counter == 0){
                counterelement.style.color = 'black';
            }
        });

        reset.addEventListener("click",()=>{
            counter=0;
            counterelement.textContent = counter;
        });