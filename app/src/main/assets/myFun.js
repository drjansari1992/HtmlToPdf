   function showAndroidToast(toast) {
       AndroidFunction.showToast(toast);
   }

   function openAndroidDialog() {
       AndroidFunction.openAlertDialog();
   }

   function callFromActivity(msg){
        document.getElementById("mytext").innerHTML = msg;
   }

   function callName(text){
        document.getElementById("name").innerHTML = text;
   }

   function callAddress(text){
        document.getElementById("address").innerHTML = text;
   }