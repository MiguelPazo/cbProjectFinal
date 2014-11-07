$(document).ready(function() {
    $('input.numeric').numeric();
    $('input.decimal').numeric('.');

    $('form').submit(function(e) {
        var send = true;

        $('form input').each(function(e) {
            if ($(this).hasClass('required')) {
                if ($(this).val() == '') {
                    send = false;
                }
            }
        });

        if (!send) {
            e.preventDefault();
            alert('Debe llenar todos los campos del formulario!');
        }
    });
})