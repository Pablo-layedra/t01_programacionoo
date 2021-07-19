package Diagramas_de_flujo;

import java.util.Scanner;

public class MainTG1 {

	public static void main(String[] args) {
	
		System.out.println("Calcular la edad de una persona en año, mes y día");
		
		System.out.println("Insertar fecha de hoy:");
		System.out.println("Día:");
		Scanner teclado4=new Scanner(System.in);
		int Da= teclado4.nextInt();
		System.out.println("Mes:");
		Scanner teclado5=new Scanner(System.in);
		int Ma= teclado5.nextInt();
		System.out.println("Año:");
		Scanner teclado6=new Scanner(System.in);
		int Aa= teclado6.nextInt();
		
		System.out.println("Insertar fecha de nacimiento:");
		System.out.println("Día:");
		Scanner teclado=new Scanner(System.in);
		int D= teclado.nextInt();
		System.out.println("Mes:");
		Scanner teclado2=new Scanner(System.in);
		int M= teclado2.nextInt();
		System.out.println("Año:");
		Scanner teclado3=new Scanner(System.in);
		int A= teclado3.nextInt();
		
		int Ab=(Aa%4);
		
		if (Ab==0) {
			if (M==1){
				if (D<=Da){
					int Ae=(Aa-A);
					int Me=(Ma-M);
					int De=(Da-D);
					System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
				}else{
					if (M==Ma){
						int Ae=(Aa-A-1);
						int Me=(10+Ma);
						int De=(31-D+Da);
						System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
					}else{
						int Ae=(Aa-A);
						int Me=(Ma-M);
						int De=(31-D+Da);
						System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
					}
				}
			}else{
				if (M==2){
					if (M<=Ma){
						if (D<=Da){
							int Ae=(Aa-A);
							int Me=(Ma-M);
							int De=(Da-D);
							System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
						}else{
							int Ae=((Aa-A)-1);
							int Me=(Ma-M-1);
							int De=(29-D+Da);
							System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
						}
					}else{
						if (D<=Da){
							int Ae=(Aa-A-1);
							int Me=(10+Ma);
							int De=(Da-D);
							System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
						}else{
							int Ae=((Aa-A)-1);
							int Me=(9+Ma);
							int De=(29-D+Da);
							System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
						}
					}
				}else{
					if (M==3){
						if (M<=Ma){
							if (D<=Da){
								int Ae=(Aa-A);
								int Me=(Ma-M);
								int De=(Da-D);
								System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
							}else{
								int Ae=(Aa-A-1);
								int Me=(Ma-M-1);
								int De=(31-D+Da);
								System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
							}
						}else{
							if (D<=Da){
								int Ae=(Aa-A-1);
								int Me=(10+Ma-1);
								int De=(Da-D);
								System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
							}else{
								int Ae=(Aa-A-1);
								int Me=(8+Ma);
								int De=(31-D+Da);
								System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
							}
						}
					}else{
						if (M==4){
							if (M<=Ma){
								if (D<=Da){
									int Ae=(Aa-A);
									int Me=(Ma-M);
									int De=(Da-D);
									System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								}else{
									int Ae=(Aa-A-1);
									int Me=(Ma-M-1);
									int De=(30-D+Da);
									System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								}
							}else{
								if (D<=Da){
									int Ae=(Aa-A-1);
									int Me=(8+Ma);
									int De=(Da-D);
									System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								}else{
									int Ae=(Aa-A-1);
									int Me=(7+Ma);
									int De=(30-D+Da);
									System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								}
							}
					   }else{
						    if (M==5){
						 	    if (M<=Ma){
								   if (D<=Da){
									   int Ae=(Aa-A);
									   int Me=(Ma-M);
									   int De=(Da-D);
									   System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								   }else{
									   int Ae=(Aa-A-1);
									   int Me=(Ma-M-1);
									   int De=(31-D+Da);
									   System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								   }
							    }else{
								   if (D<=Da){
									   int Ae=(Aa-A-1);
									   int Me=(7+Ma);
									   int De=(Da-D);
									   System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								   }else{
									   int Ae=(Aa-A-1);
									   int Me=(6+Ma);
									   int De=(31-D+Da);
									   System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								   }
							    }
						    }else{
							    if (M==6){
								   if (M<=Ma){
								      if (D<=Da){
								    	 int Ae=(Aa-A);
									     int Me=(Ma-M);
										 int De=(Da-D);
										 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									  }else{
										 int Ae=(Aa-A-1);
										 int Me=(Ma-M-1);
										 int De=(30-D+Da);
										 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									  }
								   }else{
									  if (D<=Da){
										  int Ae=(Aa-A-1);
										 int Me=(6+Ma);
										 int De=(Da-D);
										 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									  }else{
										  int Ae=(Aa-A-1);
										 int Me=(5+Ma);
										 int De=(30-D+Da);
										 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									 }
								  }
						       }else{
							      if (M==7){
							    	  if (M<=Ma){
									      if (D<=Da){
									    	  int Ae=(Aa-A);
										     int Me=(Ma-M);
											 int De=(Da-D);
											 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
										  }else{
											  int Ae=(Aa-A-1);
											 int Me=(Ma-M-1);
											 int De=(31-D+Da);
											 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
										  }
									   }else{
										   if (D<=Da){
											   int Ae=(Aa-A-1);
												 int Me=(5+Ma);
												 int De=(Da-D);
												 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
											  }else{
												  int Ae=(Aa-A-1);
												 int Me=(4+Ma);
												 int De=(31-D+Da);
												 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
											 }
									      }
							          }else{
							        	  if (M==8) {
									    	  if (M<=Ma){
											      if (D<=Da){
											    	  int Ae=(Aa-A);
												     int Me=(Ma-M);
													 int De=(Da-D);
													 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
												  }else{
													  int Ae=(Aa-A-1);
													 int Me=(Ma-M-1);
													 int De=(31-D+Da);
													 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
												  }
											   }else{
												   if (D<=Da){
													   int Ae=(Aa-A-1);
														 int Me=(4+Ma);
														 int De=(Da-D);
														 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
													  }else{
														  int Ae=(Aa-A-1);
														 int Me=(3+Ma);
														 int De=(31-D+Da);
														 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
													 }
											   }
							        	  }else{
							        		  if (M==9) {
										    	  if (M<=Ma){
												      if (D<=Da){
												    	  int Ae=(Aa-A);
													     int Me=(Ma-M);
														 int De=(Da-D);
														 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
													  }else{
														  int Ae=(Aa-A-1);
														 int Me=(Ma-M-1);
														 int De=(30-D+Da);
														 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
													  }
												   }else{
													   if (D<=Da){
														   int Ae=(Aa-A-1);
															 int Me=(3+Ma);
															 int De=(Da-D);
															 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
														  }else{
															  int Ae=(Aa-A-1);
															 int Me=(2+Ma);
															 int De=(30-D+Da);
															 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
														 }
												   }
							        	      }else{
							        	    	  if (M==10) {
											    	  if (M<=Ma){
													      if (D<=Da){
													    	  int Ae=(Aa-A);
														     int Me=(Ma-M);
															 int De=(Da-D);
															 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
														  }else{
															  int Ae=(Aa-A-1);
															 int Me=(Ma-M-1);
															 int De=(31-D+Da);
															 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
														  }
													   }else{
														   if (D<=Da){
															   int Ae=(Aa-A-1);
																 int Me=(2+Ma);
																 int De=(Da-D);
																 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
															  }else{
																  int Ae=(Aa-A-1);
																 int Me=(1+Ma);
																 int De=(31-D+Da);
																 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
															 }
													   }
							        	    	   }else{
							        	    		   if (M==11) {
													    	  if (M<=Ma){
															      if (D<=Da){
															    	  int Ae=(Aa-A);
																     int Me=(Ma-M);
																	 int De=(Da-D);
																	 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																  }else{
																	  int Ae=(Aa-A-1);
																	 int Me=(Ma-M-1);
																	 int De=(30-D+Da);
																	 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																  }
															   }else{
																   if (D<=Da){
																	   int Ae=(Aa-A-1);
																		 int Me=(1+Ma);
																		 int De=(Da-D);
																		 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																	  }else{
																		  int Ae=(Aa-A-1);
																		 int Me=(Ma);
																		 int De=(30-D+Da);
																		 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																	 }
															   } 
							        	    		    }else{
							        	    		    	 if (M<=Ma){
															      if (D<=Da){
															    	  int Ae=(Aa-A);
																     int Me=(Ma-M);
																	 int De=(Da-D);
																	 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																  }else{
																	  int Ae=(Aa-A);
																	 int Me=(Ma-M);
																	 int De=(31-D+Da);
																	 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																  }
															   }else{
																   if (D<=Da){
																	   int Ae=(Aa-A-1);
																		 int Me=(0+Ma);
																		 int De=(Da-D);
																		 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																	  }else{
																		  int Ae=(Aa-A-1);
																		 int Me=(Ma-1);
																		 int De=(31-D+Da);
																		 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																	 }
															   } 
							        	    		    }
							        	    	   }
							        	      }
							        	  }
							          }
							      }
						       } 	    
						    }			 
					   }	          
					 }		    	
				 } 
		 }else{
				if (M==1){
					if (D<=Da){
						int Ae=(Aa-A);
						int Me=(Ma-M);
						int De=(Da-D);
						System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
					}else{
						if (M==Ma){
							int Ae=(Aa-A-1);
							int Me=(Ma+10);
							int De=(31-D+Da);
							System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
						}else{
							int Ae=(Aa-A);
							int Me=(Ma-M-1);
							int De=(31-D+Da);
							System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
						}
					}
				}else{
					if (M==2){
						if (M<=Ma){
							if (D<=Da){
								int Ae=(Aa-A);
								int Me=(Ma-M);
								int De=(Da-D);
								System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
							}else{
								int Ae=(Aa-A-1);
								int Me=(Ma-M-1);
								int De=(28-D+Da);
								System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
							}
						}else{
							if (D<=Da){
								int Ae=(Aa-A-1);
								int Me=(10+Ma);
								int De=(Da-D);
								System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
							}else{
								int Ae=(Aa-A-1);
								int Me=(9+Ma);
								int De=(28-D+Da);
								System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
							}
						}
					}else{
						if (M==3){
							if (M<=Ma){
								if (D<=Da){
									int Ae=(Aa-A);
									int Me=(Ma-M);
									int De=(Da-D);
									System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								}else{
									int Ae=(Aa-A-1);
									int Me=(Ma-M-1);
									int De=(31-D+Da);
									System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								}
							}else{
								if (D<=Da){
									int Ae=(Aa-A-1);
									int Me=(9+Ma);
									int De=(Da-D);
									System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								}else{
									int Ae=(Aa-A-1);
									int Me=(8+Ma);
									int De=(31-D+Da);
									System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
								}
							}
						}else{
							if (M==4){
								if (M<=Ma){
									if (D<=Da){
										int Ae=(Aa-A);
										int Me=(Ma-M);
										int De=(Da-D);
										System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									}else{
										int Ae=(Aa-A-1);
										int Me=(Ma-M-1);
										int De=(30-D+Da);
										System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									}
								}else{
									if (D<=Da){
										int Ae=(Aa-A-1);
										int Me=(8+Ma);
										int De=(Da-D);
										System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									}else{
										int Ae=(Aa-A-1);
										int Me=(7+Ma);
										int De=(30-D+Da);
										System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									}
								}
						   }else{
							    if (M==5){
							 	    if (M<=Ma){
									   if (D<=Da){
										   int Ae=(Aa-A);
										   int Me=(Ma-M);
										   int De=(Da-D);
										   System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									   }else{
										   int Ae=(Aa-A-1);
										   int Me=(Ma-M-1);
										   int De=(31-D+Da);
										   System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									   }
								    }else{
									   if (D<=Da){
										   int Ae=(Aa-A-1);
										   int Me=(7+Ma);
										   int De=(Da-D);
										   System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									   }else{
										   int Ae=(Aa-A-1);
										   int Me=(6+Ma);
										   int De=(31-D+Da);
										   System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
									   }
								    }
							    }else{
								    if (M==6){
									   if (M<=Ma){
									      if (D<=Da){
									    	  int Ae=(Aa-A);
										     int Me=(Ma-M);
											 int De=(Da-D);
											 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
										  }else{
											  int Ae=(Aa-A-1);
											 int Me=(Ma-M-1);
											 int De=(30-D+Da);
											 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
										  }
									   }else{
										  if (D<=Da){
											  int Ae=(Aa-A-1);
											 int Me=(6+Ma);
											 int De=(Da-D);
											 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
										  }else{
											  int Ae=(Aa-A-1);
											 int Me=(5+Ma);
											 int De=(30-D+Da);
											 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
										 }
									  }
							       }else{
								      if (M==7){
								    	  if (M<=Ma){
										      if (D<=Da){
										    	  int Ae=(Aa-A);
											     int Me=(Ma-M);
												 int De=(Da-D);
												 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
											  }else{
												  int Ae=(Aa-A-1);
												 int Me=(Ma-M-1);
												 int De=(31-D+Da);
												 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
											  }
										   }else{
											   if (D<=Da){
												   int Ae=(Aa-A-1);
													 int Me=(5+Ma);
													 int De=(Da-D);
													 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
												  }else{
													  int Ae=(Aa-A-1);
													 int Me=(4+Ma);
													 int De=(31-D+Da);
													 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
												 }
										   }
								      }else{
								    	  if (M==8){
									    	  if (M<=Ma){
											      if (D<=Da){
											    	  int Ae=(Aa-A);
												     int Me=(Ma-M);
													 int De=(Da-D);
													 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
												  }else{
													  int Ae=(Aa-A-1);
													 int Me=(Ma-M-1);
													 int De=(31-D+Da);
													 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
												  }
											   }else{
												   if (D<=Da){
													   int Ae=(Aa-A-1);
														 int Me=(4+Ma);
														 int De=(Da-D);
														 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
													  }else{
														  int Ae=(Aa-A-1);
														 int Me=(3+Ma);
														 int De=(31-D+Da);
														 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
													 }
											   }
								        	  }else{
								        		  if (M==9) {
											    	  if (M<=Ma){
													      if (D<=Da){
													    	  int Ae=(Aa-A);
														     int Me=(Ma-M);
															 int De=(Da-D);
															 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
														  }else{
															  int Ae=(Aa-A-1);
															 int Me=(Ma-M-1);
															 int De=(30-D+Da);
															 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
														  }
													   }else{
														   if (D<=Da){
															   int Ae=(Aa-A-1);
																 int Me=(3+Ma);
																 int De=(Da-D);
																 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
															  }else{
																  int Ae=(Aa-A-1);
																 int Me=(2+Ma);
																 int De=(30-D+Da);
																 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
															 }
													   }
								        	      }else{
								        	    	  if (M==10) {
												    	  if (M<=Ma){
														      if (D<=Da){
														    	  int Ae=(Aa-A);
															     int Me=(Ma-M);
																 int De=(Da-D);
																 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
															  }else{
																  int Ae=(Aa-A-1);
																 int Me=(Ma-M-1);
																 int De=(31-D+Da);
																 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
															  }
														   }else{
															   if (D<=Da){
																   int Ae=(Aa-A-1);
																	 int Me=(2+Ma);
																	 int De=(Da-D);
																	 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																  }else{
																	  int Ae=(Aa-A-1);
																	 int Me=(1+Ma);
																	 int De=(31-D+Da);
																	 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																 }
														   }
								        	    	   }else{
								        	    		   if (M==11) {
														    	  if (M<=Ma){
																      if (D<=Da){
																    	  int Ae=(Aa-A);
																	     int Me=(Ma-M);
																		 int De=(Da-D);
																		 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																	  }else{
																		  int Ae=(Aa-A-1);
																		 int Me=(Ma-M-1);
																		 int De=(30-D+Da);
																		 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																	  }
																   }else{
																	   if (D<=Da){
																		   int Ae=(Aa-A-1);
																			 int Me=(1+Ma);
																			 int De=(Da-D);
																			 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																		  }else{
																			  int Ae=(Aa-A-1);
																			 int Me=(Ma);
																			 int De=(30-D+Da);
																			 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																		 }
																   } 
								        	    		    }else{
								        	    		    	 if (M<=Ma){
																      if (D<=Da){
																    	  int Ae=(Aa-A);
																	     int Me=(Ma-M);
																		 int De=(Da-D);
																		 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																	  }else{
																		  int Ae=(Aa-A-1);
																		 int Me=(Ma-M);
																		 int De=(31-D+Da);
																		 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																	  }
																   }else{
																	   if (D<=Da){
																		   int Ae=(Aa-A-1);
																			 int Me=(0+Ma);
																			 int De=(Da-D);
																			 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																		  }else{
																			  int Ae=(Aa-A);
																			 int Me=(Ma-1);
																			 int De=(31-D+Da);
																			 System.out.println("La edad es:"+Ae+"años;"+Me+"meses;"+De+"días.");
																		 }
																   } 
								        	    		    }
								        	    	   }
								        	      }
								        	  }
								          }
								      }
							       } 	    
							    }			 
						   }	          
						 }		    	
			     	 } 
			   }
		 }
	 }

