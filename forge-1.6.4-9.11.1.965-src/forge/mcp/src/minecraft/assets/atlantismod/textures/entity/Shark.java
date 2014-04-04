/*package net.minecraft.src;

public class ModelShark extends ModelBase
{
  //fields
    ModelRenderer tail;
    ModelRenderer body1;
    ModelRenderer fin1-1;
    ModelRenderer fin1-2;
    ModelRenderer fin1-3;
    ModelRenderer jaw1;
    ModelRenderer jaw2;
  
  public ModelShark()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      tail = new ModelRenderer(this, 0, 0);
      tail.addBox(-6F, -3F, -1F, 12, 6, 16);
      tail.setRotationPoint(0F, 8F, 15F);
      tail.setTextureSize(128, 128);
      tail.mirror = true;
      setRotation(tail, 0F, 0F, 0F);
      body1 = new ModelRenderer(this, 46, 31);
      body1.addBox(-8F, -5F, 0F, 16, 10, 25);
      body1.setRotationPoint(0F, 8F, -10F);
      body1.setTextureSize(128, 128);
      body1.mirror = true;
      setRotation(body1, 0F, 0F, 0F);
      fin1-1 = new ModelRenderer(this, 73, 17);
      fin1-1.addBox(-2F, -3F, -1F, 4, 4, 10);
      fin1-1.setRotationPoint(0F, 3F, -3F);
      fin1-1.setTextureSize(128, 128);
      fin1-1.mirror = true;
      setRotation(fin1-1, 0F, 0F, 0F);
      fin1-2 = new ModelRenderer(this, 76, 8);
      fin1-2.addBox(-2F, -5F, 1F, 4, 2, 7);
      fin1-2.setRotationPoint(0F, 3F, -3F);
      fin1-2.setTextureSize(128, 128);
      fin1-2.mirror = true;
      setRotation(fin1-2, 0F, 0F, 0F);
      fin1-3 = new ModelRenderer(this, 79, 0);
      fin1-3.addBox(-1F, -7F, 2F, 2, 2, 6);
      fin1-3.setRotationPoint(0F, 3F, -3F);
      fin1-3.setTextureSize(128, 128);
      fin1-3.mirror = true;
      setRotation(fin1-3, 0F, 0F, 0F);
      jaw1 = new ModelRenderer(this, 2, 31);
      jaw1.addBox(-6F, -1F, -9F, 12, 2, 10);
      jaw1.setRotationPoint(0F, 6F, -10F);
      jaw1.setTextureSize(128, 128);
      jaw1.mirror = true;
      setRotation(jaw1, 0.3490659F, 0F, 0F);
      jaw2 = new ModelRenderer(this, 2, 54);
      jaw2.addBox(-6F, -1F, -9F, 12, 2, 10);
      jaw2.setRotationPoint(0F, 12F, -10F);
      jaw2.setTextureSize(128, 128);
      jaw2.mirror = true;
      setRotation(jaw2, 0.0698132F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    tail.render(f5);
    body1.render(f5);
    fin1-1.render(f5);
    fin1-2.render(f5);
    fin1-3.render(f5);
    jaw1.render(f5);
    jaw2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
*/