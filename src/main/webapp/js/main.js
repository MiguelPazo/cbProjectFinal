$(document).ready(function() {
    $('input.numeric').numeric();
    $('input.decimal').numeric('.');

    $('form').submit(function(e) {
        var send = true;

        $('form input').each(function(e) {
            if ($(this).hasClass('required')) {
                var div = $(this).parent();
                
                if ($(this).val() == '') {
                    div.addClass('has-error');
                    send = false;
                } else {
                    div.removeClass('has-error');
                }
            }
        });

        if (!send) {
            e.preventDefault();
            alert('Debe llenar todos los campos obligatorios del formulario. (*)');
        }
    });
})