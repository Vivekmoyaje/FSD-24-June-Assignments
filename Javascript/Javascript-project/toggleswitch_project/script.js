
document.addEventListener("DOMContentLoaded", function(){

    const toggleswitch = document.getElementById("toggleswitch");
    const container = document.querySelector(".container");

    toggleswitch.addEventListener("click",function(){
        toggleswitch.classList.toggle("on");

        if(toggleswitch.classList.contains("on")){
            container.style.backgroundColor = "lightgreen";
        }
        else{
            container.style.backgroundColor = "#ccc";
        }
    });
});