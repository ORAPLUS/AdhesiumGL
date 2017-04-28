$(document).ready(function(){
	$("#upload-file-input").on("change", uploadFile);
});

function uploadFile(){
	$.ajax({
		url:"/api/upload",
		type:"POST",
		data:new FormData($("#upload-file-form")[0]),
		enctype:'multipart/form-data',
		processData: false,
		contentType:false,
		cache:false,
		success: function(){
			$("upload-file-message").text("File upload Operation is Successful").addClass("alert alert-success");
		},
		error:function(){
			$("upload-file-message").text("File upload Operation is UnSuccessful").addClass("alert alert-danger");
		}
	});
	
	
}